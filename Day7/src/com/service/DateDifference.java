package com.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDifference {
	public static long getDateDifference(String date1, String date2) {
		LocalDate d1 = LocalDate.parse(date1, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate d2 = LocalDate.parse(date2, DateTimeFormatter.ISO_LOCAL_DATE);
		return Duration.between(d1.atStartOfDay(), d2.atStartOfDay()).toDays();
	}
}
