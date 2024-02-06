package com.book;

public class MyThread3 extends Thread{
	
	BookTheaterSeat b;
	int seats;
	
	MyThread3(BookTheaterSeat b, int seats){
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.bookSeat(seats);
	}

}
