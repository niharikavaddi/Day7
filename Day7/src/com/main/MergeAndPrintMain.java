package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.service.MergeAndPrint;

/**
 * Write a code to read two int array lists of size 5 each as input and to merge
 * the two arrayLists, sort the merged arraylist in ascending order and fetch
 * the elements at 2nd, 6th and 8th index into a new arrayList and return the
 * final ArrayList.
 * 
 * Include a class UserMainCode with a static method sortMergedArrayList which
 * accepts 2 ArrayLists.
 * 
 * The return type is an ArrayList with elements from 2,6 and 8th index position
 * .Array index starts from position 0.
 * 
 * Create a Main class which gets two array list of size 5 as input and call the
 * static method sortMergedArrayList present in the UserMainCode
 * 
 * @author Lakshmi Neeharika
 *
 */
public class MergeAndPrintMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter 5 values of list1:");
		for (int i = 0; i < 5; i++) {
			list1.add(scanner.nextInt());
		}
		System.out.println("Enter 5 values of list2:");
		for (int i = 0; i < 5; i++) {
			list2.add(scanner.nextInt());
		}
		List<Integer> result = MergeAndPrint.sortMergedArrayList(list1, list2);
		result.stream().forEach(a -> System.out.println(a));
		scanner.close();
		scanner = null;
		result = null;
		list1 = null;
		list2 = null;

	}

}
