package com.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a Java program to get the maximum value of the year, month, week, date
 * from the current date of a default calendar
 * 
 * @author Lakshmi Neeharika
 *
 */
public class MaximumOfCalendar {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		System.out.println("Maximum Year: " + calendar.getMaximum(Calendar.YEAR));
		System.out.println("Maximum Month: " + calendar.getMaximum(Calendar.MONTH));
		System.out.println(("Maximum Date:" + calendar.getMaximum(Calendar.DATE)));
		calendar = null;

	}

}
