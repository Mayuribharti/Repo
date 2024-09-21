package com.theads.example.synchronization;

class BookSeat {

    int totalSeat = 10;

    synchronized void book(int seat) {
        if (totalSeat >= seat) {
            System.out.println(seat + " booked successfully...!!");
            totalSeat = totalSeat - seat;
            System.out.println(totalSeat + " are left");
        } else {
            System.out.println("Sorry .... not booked");
            System.out.println(seat);
        }
    }
}


public class MovieBookApp extends Thread {

    static BookSeat b;
    int seats;

    public void run() {
        b.book(seats);
    }

    public static void main(String[] args) {
        b = new BookSeat();
        MovieBookApp deepak = new MovieBookApp();
        deepak.seats = 7;
        deepak.start();

        MovieBookApp arun = new MovieBookApp();
        arun.seats = 4;
        arun.start();

    }


}
