package com.book;

public class BookTheaterSeat {
	static int total_seats=50;
	
	static synchronized void bookSeat(int seats) {
		if(total_seats>=seats) {
			System.out.println(seats+" Seats booked successfully");
			total_seats=total_seats-seats;
			System.out.println("Seats left "+total_seats);
		}
		else {
			System.out.println(seats+" Seats cannot be booked");
			System.out.println("seat left "+total_seats);
			//System.out.println();
			
		}
	}

}
