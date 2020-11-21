package com.main;

import java.util.Scanner;

import com.service.DateDifference;

/**
 * Get two date strings as input and write code to find difference between two
 * dates in days.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class DateDifferenceMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Date 1");
		String date1 = scanner.next();
		System.out.println("Date 2:");
		String date2 = scanner.next();
		System.out.println("Difference in Days: " + DateDifference.getDateDifference(date1, date2));
		scanner.close();
		scanner = null;

	}

}
