package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeAndPrint {
	public static List<Integer> sortMergedArrayList(List<Integer> list1, List<Integer> list2) {
		list1.addAll(list2);
		Collections.sort(list1);
		List<Integer> result = new ArrayList<Integer>();
		result.add((int) list1.get(2));
		result.add((int) list1.get(6));
		result.add((int) list1.get(8));
		return result;
	}
}
