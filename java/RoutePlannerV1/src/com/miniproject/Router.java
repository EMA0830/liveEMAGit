package com.miniproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.miniproject.exception.NoDirectFlightException;
import com.miniproject.model.Route;
import com.miniproject.util.DestinationCityComparator;

public class Router {
	private List<Route> routeInfo = null;
	private String fromCity = null;

	public Router() {
		loadRoutes();
	}

	private void loadRoutes() {
		String fileName = "C:\\Users\\Anandita thakur\\Desktop\\StackRouteAssignments\\MiniProject2\\src\\routes.csv";
		// routeInfo = loadRoutes(fileName);
		routeInfo = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();
			String line = null;
			while ((line = br.readLine()) != null) {
				String arr[] = line.split(",");
				Route route = new Route();
				route.setFrom(arr[0]);
				route.setTo(arr[1]);
				route.setDistance(Integer.parseInt(arr[2]));
				route.setTravelTime(arr[3]);
				route.setAirfare(arr[4]);
				routeInfo.add(route);
			}
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.err.println(routesList);
	}

//	overloading
	private void displayRoutes(List<Route> routeInfo) {
		System.out.println("From\t\t  To\t\tDistance\tTravel Time\tAirfare");
		for (Route route : routeInfo) {
			System.out.println(route);
		}
	}

// overloading
	public void displayAllRoutes() {
		System.out.println(">>>>>>>>>>>>>> ALL ROUTES >>>>>>>>>>>>> ");
		displayRoutes(routeInfo);
	}

	public void sortDirectFlights() {
		System.out.println(">>>>>>>>>>>>>> SORTED DIRECT FLIGHTS >>>>>>>>>>>>> ");
		routeInfo = getDirectFlights();
		Collections.sort(routeInfo, new DestinationCityComparator());
		displayRoutes(routeInfo);
	}

// task 2
	// displays
	public void showDirectFlights() {
		System.out.println(">>>>>>>>>>>>>> DIRECT FLIGHTS >>>>>>>>>>>>> ");
		List<Route> directFlights = getDirectFlights();
		if (directFlights.size() != 0) {
			displayRoutes(directFlights);
		} else {
			String message = "We are sorry. At this point of time,";
			message += " we do not have any information on flights origination from " + fromCity;

			NoDirectFlightException noDirectFlightException = new NoDirectFlightException(message);
			throw noDirectFlightException;
		}
	}

	private List<Route> getDirectFlights() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Source city : ");
		fromCity = scanner.nextLine();
		List<Route> directFlights = new ArrayList<>();
		for (Route route : routeInfo) {
			if (route.getFrom().equals(fromCity)) {
				directFlights.add(route);
			}
		}
		return directFlights;
	}
}
