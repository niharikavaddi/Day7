package com.service;

import java.time.LocalDate;

public class NumberOfDaysInaMonth {
	public static int getNumberOfDay(int year, int month) {
		LocalDate date = LocalDate.of(year, month, 1);
		return date.lengthOfMonth();
	}
}
