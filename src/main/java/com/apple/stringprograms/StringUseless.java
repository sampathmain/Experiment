package com.apple.stringprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class StringUseless {

	// @Test
	public void tes() throws IOException {

		FileReader fr = new FileReader("/Users/QE/Desktop/inputfile");
		BufferedReader br = new BufferedReader(fr);
		while (br.readLine() != null) {

			String[] str = br.readLine().split("\\s");

		}

	}

	//@Test
	public void stringT() {
		String pool = "Sampath";
		String str = "Sampath";
		pool.replace("am", "sl");
		// pool="Immutable testing";
		System.out.println(pool);

	}
	//@Test
	public void stringReplace() {
		String newone="Name is Sampath";
		StringBuffer sb=new StringBuffer(newone);
		
		for(int i=0;i<newone.length();i++) {
			
			if(sb.charAt(i)=='a') {
				sb.replace(i, i+1, "b");
			}
		}
		System.out.println(sb);
	}
	//@Test
	public void replcing(){
		 String str = "This is an example string";
	        System.out.println("Replace char 's' with 'o':"
	                    +str.replace('s', 'o'));
	                     
	        System.out.println("Replace first occurance of string\"is\" with \"ui\":"
	                    +str.replaceFirst("is", "ui"));
	                     
	        System.out.println("Replacing \"is\" every where with \"no\":"
	                    +str.replaceAll("is", "no"));
	
	}

	//@Test
	public void minimumvalue(){
		 //System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		Set set =new HashSet();
		set.add(1);
		set.add(12);
		set.add("Sampath");
		
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}

}
