package deadlock;

public class RunThread {

	 

	public static void main(String[] args) {
		 final String firstSt = "Sampath";
		  final String secondSt = "Shetty";

		Thread th1 = new Thread() {
			public void run() {
				synchronized (firstSt) {
					System.out.println("Synchronized First String");

				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (secondSt) {
					System.out.println("Synchronized Sec String Thread1");

				}
				}
			}

		};
		Thread th2 = new Thread() {
			public void run() {
				synchronized (secondSt) {
					System.out.println("Synchronized First String");

				
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized (firstSt) {
					System.out.println("Synchronized Sec String Thread2");

				}
				}
			}

		};
		th1.start();
		th2.start();

	}
}
