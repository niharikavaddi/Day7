package com.service;

public class FirstLastOfaSentence {
	public String checkValidiity(StringBuffer data) {
		if (data.charAt(0) == data.charAt(data.length() - 1)) {
			return "Valid";
		} else {
			return "Not Valid";
		}
	}

}
