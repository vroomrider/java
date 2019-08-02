package com.threadimpl.demo.restcall.initial;

import java.util.concurrent.locks.ReentrantLock;

import com.threadimpl.demo.restcall.model.MessagePayload;
import com.threadimpl.demo.restcall.util.SequenceTerminalCount;

public class RestControllerClass implements Runnable {

	private SequenceTerminalCount data;
	private ReentrantLock reentrantLock;
	private MessagePayload payload;

	public RestControllerClass() {
		reentrantLock = new ReentrantLock();
	}

	public String validateThread() {
		RestControllerClass rcs = null;
		Thread t = null;
		try {
			rcs = new RestControllerClass();
			t = new Thread(rcs);
			t.start();
			// synchronized (t) {
			// try {
			// t.wait();
			// } catch (Exception ex) {
			// ex.printStackTrace();
			// }
			// }
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "Connection Available";
	}

	@Override
	public void run() {
		data = new SequenceTerminalCount();
		// synchronized (this) {
		// }
		if (!reentrantLock.isLocked()) {
			System.out.println("NO Lock");
			reentrantLock.lock();
			try {
				// *******L>O>C>K************************
				payload = new MessagePayload();
				payload.setSequenceNo(data.getSequenceNo());
				payload.setTerminalId(data.getTerminalId());
				payload.setTimeStamp(System.currentTimeMillis());
				System.out.println("Thread.Name: " + Thread.currentThread().getName());
				for (int i = 0; i <= 7; i++) {
					// System.out.println(
					// "Thread.Name: " + Thread.currentThread().getName() + ", Thread Method
					// run(..), i = " + i);
				}
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				// if (Thread.holdsLock(this)) {
				// System.out.println("Finally " + Thread.currentThread().getName() + " Is Still
				// Locked!");
				// }
				// System.out.println(reentrantLock.isHeldByCurrentThread());
				// System.out.println("Locked: " + reentrantLock.isLocked());
				// System.out.println(Thread.currentThread().getName() + " % " +
				// Thread.currentThread().holdsLock(this));
				reentrantLock.unlock();
				// System.out.println(payload.toString());
				// System.out.println(reentrantLock.isHeldByCurrentThread());
				// System.out.println("is Locked: " + reentrantLock.isLocked());
			}
		} else {
			System.out.println("Locked...");
			reentrantLock.lock();
			try {

				// *******L>O>C>K************************
				payload = new MessagePayload();
				payload.setSequenceNo(data.getSequenceNo() + 1);
				payload.setTerminalId(data.getTerminalId() + 1);
				payload.setTimeStamp(System.currentTimeMillis());
				System.out.println("Thread.Name: " + Thread.currentThread().getName());
				for (int i = 0; i <= 7; i++) {
					// System.out.println(
					// "Thread.Name: " + Thread.currentThread().getName() + ", Thread Method
					// run(..), i = " + i);
				}
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				reentrantLock.unlock();
				System.out.println(payload.toString());
			}
		}
	}

}
