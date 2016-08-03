package com.apple.stringprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class StringSecond {

	// @Test
	public void stringRemove() {
		String str = "I am Sampath Kumar Shetty";
		char[] strChar = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (char c : strChar) {
			if (c == 'a') {
				sb.append('k');
			} else
				sb.append(c);
		}

		System.out.println(sb.toString());

	}

	// @Test
	public void permutations() {
		String str = "i am learning malayalam was it a car or a cat i saw race car";
		int LengthLongestPalindrome = 0;
		String LongestPalindrome = null;

		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length() && j != i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					// while (j<=i){
					String newString = str.substring(i, j);
					String revStr = "";
					for (int l = newString.length() - 1; l > 0; l--) {
						revStr = revStr + newString.charAt(l);
					}
					if (newString.equals(revStr)) {
						if (LengthLongestPalindrome < newString.length()) {
							LengthLongestPalindrome = newString.length();
							LongestPalindrome = newString;
						}
					}

					// }

				}
			}
		}
		System.out.println(LongestPalindrome);
		System.out.println(LengthLongestPalindrome);
	}

	//@Test
	public void repeatedChar() {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 2, 3, 1, 0, 5 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr2.length; i++) {

			map.put(arr2[i], arr2[i]);
		}

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			if (!map.containsKey(arr1[i])) {
				set.add(arr1[i]);
			}

		}

		Iterator<Integer> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

	//@Test
	public void duplicateElements() {
		int[] arr={12,34,2,4,6,78,4,2,34};
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(!set.add(arr[i])){
				list.add(arr[i]);
			}
			else
				set.add(arr[i]);
			
		}
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

	

}
