package com.threadsdemo.com;

public class LamdaThreadsDemo {

	public static void main(String[] args) throws InterruptedException {
		 
			
		
		
		Thread t1 = new Thread( () ->
		{
		
			for(int i=1;i<=5;i++) {
					System.out.println("Hi");
					try{
						Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
			}
			
		});
		Thread t2 = new Thread( () -> 
		{
			
			for(int i=1;i<=5;i++)
			{
					System.out.println("Hello");
					try{
						Thread.sleep(1000);
				       }
				catch(Exception e) {}	
			}
		}
		);
		t1.setName("hi thread");
		t2.setName("hello thread");
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println("name of the thread" + t1.getName());
		System.out.println("name of the thread2" + t2.getName());
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		    }
		catch (InterruptedException e) {}
			
		
		t2.start();
		System.out.println(t1.isAlive());//once the thread job is done it will be dead so we can check usin isalive
		
		t1.join();
		t2.join();//join alllows main thread to wait to executr threads
		System.out.println("Bye");
		
			
		}
	}



/*
	 * class Ho implements Runnable{
	 * 
	 * public void run() { try{for(int i=1;i<=5;i++) { System.out.println("Hi");
	 * Thread.sleep(1000); }
	 * 
	 * } catch(Exception e) {
	 * 
	 * } }
	 * 
	 * } class Hell implements Runnable{
	 * 
	 * public void run() { try{ for(int i=1;i<=5;i++) {
	 * 
	 * System.out.println("Hello"); Thread.sleep(1000); } } catch(Exception e) {
	 * 
	 * } }
	 * 
	 * }
	 */