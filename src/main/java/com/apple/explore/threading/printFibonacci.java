package com.apple.explore.threading;
class TestFibonaci {
	public  void fibonacciMeth(int n) throws InterruptedException{
		int f1=0,f2=1,f3;
		System.out.println(f1);
		System.out.println(f2);
		
		for (int i=2;i<n;i++){
			Thread.sleep(1000);
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}

class MyRunnableClass implements Runnable {
	private Thread t;
	private String tname;
	public int number;
	
	public MyRunnableClass(int n) {
		this.number=n;
		
	}
	
	public void run() {
		TestFibonaci tf = new TestFibonaci();
		try {
			tf.fibonacciMeth(number);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public void start(){
//		System.out.println("Starting " +  threadName );
//	      if (t == null)
//	      {
//	         t = new Thread (this, threadName);
//	         t.start ();
//	      }
//	}

}

public class printFibonacci {

	public static void main(String[] args) {
		MyRunnableClass mrcFirst=new MyRunnableClass(20);
		MyRunnableClass mrcSecond=new MyRunnableClass(1);
		
		Thread t1=new Thread(mrcFirst,"Thread1");
		Thread t2=new Thread(mrcSecond,"Thread2");
		t1.start();
		t2.start();
		

	}

}
