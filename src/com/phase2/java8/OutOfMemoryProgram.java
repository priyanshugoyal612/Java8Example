package com.phase2.java8;

public class OutOfMemoryProgram {

	public static void main(String[] args) throws Exception {
		while (true) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000 * 60 * 60 * 24);
					} catch (Exception ex) {
					}
				}
			}).start();
		}
	}
}
