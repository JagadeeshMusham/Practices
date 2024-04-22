package com.musham.practices.ThreadDemo;

/**
 * @author jmusham
 *
 */
public class ThreadDemoWithLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int counter = 0; counter < 10; counter++) {
				System.out.println("ThreadDemo_: In the child thread: " + counter);
			}
		};

		Thread t = new Thread(runnable);
		t.start();

		for (int counter = 0; counter < 10; counter++) {
			System.out.println("ThreadDemo_: In the main thread: " + counter);
		}
	}
}
