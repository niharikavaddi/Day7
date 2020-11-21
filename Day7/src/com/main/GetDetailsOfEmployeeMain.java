package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pojo.Employee;
import com.service.GetDetailsOfEmployee;

/**
 * A Company wants to obtain employees of a particular designation. You have
 * been assigned as the programmer to build this package. You would like to
 * showcase your skills by creating a quick prototype. The prototype consists of
 * the following steps:
 * 
 * Read Employee details from the User. The details would include name and
 * designaton in the given order. The datatype for name and designation is
 * string.
 * 
 * Build a hashmap which contains the name as key and designation as value.
 * 
 * You decide to write a function obtainDesignation which takes the hashmap and
 * designation as input and returns a string array of employee names who belong
 * to that designation as output. Include this function in class UserMainCode.
 * 
 * Create a Class Main which would be used to read employee details in step 1
 * and build the hashmap. Call the static method present in UserMainCode.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class GetDetailsOfEmployeeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Employees");
		int total = scanner.nextInt();
		Employee[] employee = new Employee[total];
		Map<String, String> details = new HashMap<String, String>();
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			System.out.println("Enter Employee " + (i + 1) + " Name:");
			employee[i].setName(scanner.next());
			System.out.println("Enter Designation:");
			employee[i].setDesignation(scanner.next());
			details.put(employee[i].getName(), employee[i].getDesignation());
		}
		System.out.println("Enter Desired Designation:");
		String desireddesig = scanner.next();
		GetDetailsOfEmployee.obtainDesignation(details,desireddesig).stream().forEach(a -> System.out.println(a));
		scanner.close();
		scanner = null;
		details = null;

	}

}
