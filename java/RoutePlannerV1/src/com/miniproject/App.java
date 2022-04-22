package com.miniproject;

import com.miniproject.exception.NoDirectFlightException;

public class App {
	public static void main(String[] args) {
//		create a router
		Router router = new Router();
//		display all routes
		router.displayAllRoutes();
		try {
//			display direct flights
			router.showDirectFlights();
		} catch (NoDirectFlightException noDirectFlightException) {
			System.out.println(noDirectFlightException.getMessage());
		}
		// display flights sorted by destination
		router.sortDirectFlights();
	}
}
