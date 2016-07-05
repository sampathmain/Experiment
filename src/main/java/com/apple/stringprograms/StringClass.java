package com.apple.stringprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class StringClass {

	public StringClass() {

	}

	public static void main(String[] args) {
		StringClass s = new StringClass();
		//strc.stringReplace("IamSampath");
		s.reverseLL();

	}

	public void stringReplace(String str) {


		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				sb.append('m');
			} else {
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb);

	}

	public void reverseLL(){
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("h");
		ll.add("i");
		ll.add("g");
		ll.add("o");
		ll.add("o");
		ll.add("d");
		Collections.sort(ll);
		System.out.println(ll);
		//Iterator it=ll.;
		
	}
}

