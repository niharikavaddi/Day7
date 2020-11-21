package com.main;

import java.util.Date;

/**
 * Write a Java program to extract date, time from the date string
 * 
 * @author Lakshmi Neeharika
 *
 */
public class ExtractDateTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toLocaleString());
		date = null;

	}

}
