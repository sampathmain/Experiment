package com.apple.stringprograms;

public class Traiangle {

	//static String check=new String("PoleTo");
	
	public Traiangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		//System.out.println(Traiangle.check);
		int n=6;
		
		for(int i=1;i<n;i++){
			for (int j=0;j<i;j++){
				if(j==2){
				System.out.print("*");
				
					continue;
				}
			}
			System.out.println();
		}
		
	}
}
