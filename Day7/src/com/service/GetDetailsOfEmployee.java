package com.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetDetailsOfEmployee {
	public static List<String> obtainDesignation(Map<String, String> details, String desireddesig) {

		return details.entrySet().stream().filter(a -> a.getValue().equalsIgnoreCase(desireddesig)).map(a -> a.getKey())
				.collect(Collectors.toList());

	}
}
