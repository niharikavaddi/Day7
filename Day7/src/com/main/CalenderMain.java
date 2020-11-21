package com.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 3.Write a Java program to get and display information (year, month, day,
 * hour, minute) of a default calendar
 * 
 * @author Lakshmi Neeharika
 *
 */
public class CalenderMain {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.format("%tB %te, %tY%n", calendar, calendar, calendar);
		System.out.format("%tl:%tM %tp%n", calendar, calendar, calendar);
		calendar = null;

	}

}
