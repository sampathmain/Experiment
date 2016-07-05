package com.apple.explore.experiment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class AppTest {
	// @Test
	private void palindrome() {
		String str = "Malayalam", revstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println(revstr);
		if (str.equalsIgnoreCase(revstr)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	// @Test
	private void Factorial() {
		AppTest apptest = new AppTest();
		int factorial = apptest.fact(3);
		System.out.println(factorial);

	}

	public int fact(int n) {

		if (n == 0)
			return 1;
		else

			return n * fact(n - 1);

	}

	// @Test
	public void RecursionReverse() {
		AppTest apptest = new AppTest();
		String reverseString = apptest.reverse("Sampath");
		System.out.println(reverseString);
	}

	public String reverse(String str) {
		if (str.length() == 1)
			return str;
		else
			return str.charAt(str.length() - 1)
					+ reverse(str.substring(0, str.length() - 1));
	}

	//@Test
	public void RepeatedWordsFile() throws IOException {
		// Scanner sc= new Scanner(System.in);
		// String nextInt=sc.next();
		FileReader fr=new FileReader("/Users/QE/Desktop/inputfile.txt");
		BufferedReader br= new BufferedReader(fr);
		
		while(br.readLine()!=null){
			
			
		}

	}
	//@Test
	public void RepeatedWordsFileAnother() throws IOException {
		String str= "This is the words program which tells about program the repeated words";
		String[] str2=str.split(" ");
		
		for(String word:str2) {
			System.out.println(word+"");
		}
		
		Set<String> set=new HashSet<String>();
		Set<String> set2=new TreeSet<String>();
		for (int i=0;i<str2.length;i++){
			if(!(set.contains(str2[i]))) {
				set.add(str2[i]);
				
			}
			else{
				set2.add(str2[i]);
				
			}
			
			
		}
		
		System.out.println(set2);
			
			
			

	}

	@Test
	public void duplicateChar() {
		String s="sampath";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		System.out.println(map);
		
	}


}