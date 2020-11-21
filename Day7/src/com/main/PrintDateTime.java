package com.main;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 1.Write a java program to print current date and time in the specified format
 * 
 * @author Lakshmi Neeharika
 *
 */
public class PrintDateTime {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date: " + simpleDateFormat.format(date) + " Time: " + date.toString());
		date = null;
		simpleDateFormat = null;
	}

}
