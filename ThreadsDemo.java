package com.threadsdemo.com;

public class ThreadsDemo {
public static void main(String[] args) {
	Runnable obj = new Hi();
	Runnable onj2 = new Hello();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(onj2);
	t1.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
	}
	t2.start();
	
}
}
class Hi implements Runnable{
	public void run() {
		try{for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			Thread.sleep(1000);
		}
		
		}
		catch(Exception e) {
			
		}
	}
}
class Hello implements Runnable{
	public void run() {
		try{
			for(int i=1;i<=5;i++) {
		
			System.out.println("Hello");
			Thread.sleep(1000);
			}
			}
		catch(Exception e) {
			
		}
	}
}