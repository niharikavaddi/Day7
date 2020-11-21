package com.main;

import java.util.Scanner;

import com.service.ValidIp;

/**
 * Write a program to read a string and validate the IP address. Print “Valid”
 * if the IP address is valid, else print “Invalid”.s
 * 
 * @author Lakshmi Neeharika
 *
 */
public class ValidIpMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter IP Address:");
			if (ValidIp.ipValidator(scanner.next()) == 1)
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		} catch (NumberFormatException numexp) {
			System.err.println(numexp.toString());
		} finally {
			scanner.close();
			scanner = null;
		}
	}

}
