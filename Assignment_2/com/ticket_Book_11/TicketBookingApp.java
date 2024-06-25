package com.ticket_Book_11;

public class TicketBookingApp {

	public static void main(String[] args) {

		//array of no of event objects
		Event events[] = {new Event("Concert",84),
							new Event("Workshop",15),
							new Event("Conference",18)};
		
		 TicketBookingSystem bookingSystem = new TicketBookingSystem(events);
		 
		 // Simulate multiple users trying to book tickets simultaneously
		 Thread user1 = new Thread(() -> {
			 bookingSystem.bookTickets("Concert", 2);
		 });
		 Thread user2 = new Thread(() -> {
			 bookingSystem.bookTickets("Conference", 5);
		 });
		 Thread user3 = new Thread(() -> {
			 bookingSystem.bookTickets("Workshop", 3);
		 });
		// Start each thread
		 user1.start(); user3.start(); user2.start();
		 
		 // Display available tickets
		 bookingSystem.displayAvailableTickets();


	}

}

