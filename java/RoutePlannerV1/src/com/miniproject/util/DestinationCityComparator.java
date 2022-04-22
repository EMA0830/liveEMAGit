package com.miniproject.util;

import java.util.Comparator;

import com.miniproject.model.Route;

public class DestinationCityComparator implements Comparator<Route> {
	@Override
	public int compare(Route route1, Route route2) {
		return route1.getTo().compareTo(route2.getTo());
	}
}