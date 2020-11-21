package com.main;

import java.util.Scanner;
import com.service.OldDate;

/**
 * Write a program to read two String variables in DD-MM-YYYY.Compare the two
 * dates and return the older date in 'MM/DD/YYYY' format.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class OldDateMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Date 1");
		String date1 = scanner.next();
		System.out.println("Date 2:");
		String date2 = scanner.next();
		System.out.println("Old Date: " + OldDate.findOldDate(date1, date2));
		scanner.close();
		scanner = null;

	}

}
