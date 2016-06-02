package com.apple.explore.experiment;

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
	
	//@Test
	public void RecursionReverse(){
		AppTest apptest = new AppTest();
		String reverseString=apptest.reverse("Sampath");
		System.out.println(reverseString);
	}
	public String reverse(String str){
		if(str.length()==1)
			return str;
		else
			return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
	}
	

}