package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertDate {
	public static String convertDateFormat(String data) {
		LocalDate date = LocalDate.of(Integer.parseInt(data.substring(6, 8)), Integer.parseInt(data.substring(3, 5)),
				Integer.parseInt(data.substring(0, 2)));
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
		return dateTimeFormatter.format(date);
	}
}
