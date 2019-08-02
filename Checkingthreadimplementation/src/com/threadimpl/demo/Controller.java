package com.threadimpl.demo;

import com.threadimpl.demo.restcall.initial.RestControllerClass;

public class Controller {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside Controller Class..");
		RestControllerClass rcs = new RestControllerClass();
		for (int i = 0; i <= 100; i++) {
			rcs.validateThread();
		}
	}
}
