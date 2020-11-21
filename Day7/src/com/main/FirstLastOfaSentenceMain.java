package com.main;

import java.util.Scanner;

import com.service.FirstLastOfaSentence;

/**
 * Write a program to read a string and to test whether first and last character
 * are same. The string is said to be be valid if the 1st and last character are
 * the same. Else the string is said to be invalid.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class FirstLastOfaSentenceMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentance:");
		StringBuffer data = new StringBuffer(scanner.nextLine());
		FirstLastOfaSentence firstLastOfaSentence = new FirstLastOfaSentence();
		System.out.println(firstLastOfaSentence.checkValidiity(data));
		scanner.close();
		scanner = null;
		firstLastOfaSentence = null;

	}

}
