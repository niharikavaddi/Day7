package com.main;

import java.util.Scanner;

import com.service.ConvertDate;

/**
 * Given a date string in the format dd/mm/yyyy, write a program to convert the
 * given date to the format dd-mm-yy.
 * 
 * @author vasuvaddi123
 *
 */
public class ConvertDateMain {

	public static void main(String[] args) {
		String data;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter date:");
			data = scanner.next();
			System.out.println(ConvertDate.convertDateFormat(data));

		} catch (Exception e) {
			System.err.println("Enter date in dd/mm/yy format");
		} finally {
			scanner.close();
			scanner = null;
		}
	}

}
