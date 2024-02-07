package com.book;

public class MoovieBook {

	public static void main(String[] args) {
		BookTheaterSeat b=new BookTheaterSeat();
	 
		MyThread1 myThread1=new MyThread1(b,5);
		myThread1.start();
		
		MyThread2 myThread2=new MyThread2(b,10);
		myThread2.start();
		
		
		MyThread3 myThread3=new MyThread3(b,15);
		myThread3.start();
		
		BookTheaterSeat b2=new BookTheaterSeat();
		
		MyThread2 myThread=new MyThread2(b2,10);
		myThread.start();
		
		MyThread1 myThreadd=new MyThread1(b2,4);
		myThreadd.start();

	}

}
