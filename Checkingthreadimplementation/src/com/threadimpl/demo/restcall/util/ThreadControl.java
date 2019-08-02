package com.threadimpl.demo.restcall.util;

public class ThreadControl {
	Boolean isLocked = false;

	public synchronized void lock() throws InterruptedException {
		// try {
		while (isLocked) {
			wait();
		}
		isLocked = true;
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
	}

	public synchronized void unlock() {
		isLocked = false;
		// try {
		notify();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// return isLocked;
	}
}
