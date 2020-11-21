package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OldDate {
	public static String findOldDate(String date1, String date2) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate d1 = LocalDate.parse(date1, DateTimeFormatter.ISO_DATE);
		LocalDate d2 = LocalDate.parse(date2, DateTimeFormatter.ISO_DATE);
		return d1.isBefore(d2) ? dateTimeFormatter.format(d1) : dateTimeFormatter.format(d2);
	}
}
