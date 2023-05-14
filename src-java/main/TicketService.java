package com.example.demo;
import java.util.*;
import java.util.Scanner;

import thirdparty.SeatReservationService;
import thirdparty.TicketPaymentService;


public class TicketService {

	public static void main(String[] args) {
		TicketPaymentService ticketPaymentService = new TicketPaymentService();
		SeatReservationService seatReservationService = new SeatReservationService();

	int infantticketcost = 0;
	int childticketcost = 10;
	int adultticketcost = 20;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the amount of adult tickets: ");
		int adultTickets = scanner.nextInt();

		System.out.println("Enter the amount of child tickets: ");
		int childTickets = scanner.nextInt();

		System.out.println("Enter the amount of infant tickets: ");
		int infantTickets = scanner.nextInt();

		int totalTickets = adultTickets + childTickets + infantTickets;

		int adultprice = adultticketcost * adultTickets;
		int childprice = childticketcost * childTickets;
		int totalprice = adultprice + childprice;

		if(adultTickets <= 0) {
			throw new IllegalArgumentException("Need at least one adult ticket");
		}


		if(totalTickets >= 20 || totalTickets <= 0) {
			throw new IllegalArgumentException("Wrong quantity of tickets selected");
		}

		if(infantTickets > adultTickets) {
			throw new IllegalArgumentException("Infants cannot be greater adult tickets");
		}
		ticketPaymentService.TicketPaymentService(totalprice);

		int totalSeats = childTickets + adultTickets;
		int[] seatNum = new int[totalSeats];
		seatNum = seatReservationService.SeatReservationService(totalSeats);
		for (int j = 0; j< totalSeats; j++) {
			System.out.print(seatNum[j]+",");

		}

	}

}

