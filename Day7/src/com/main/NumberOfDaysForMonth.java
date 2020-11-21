package com.main;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...),
 * write a program to find out total number of days in the given month for the
 * given year.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class NumberOfDaysForMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year and Month");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		LocalDate localDate = LocalDate.of(year, month, 1);
		System.out.println(localDate.lengthOfMonth());
		scanner.close();
		scanner = null;
		localDate = null;

	}

}
