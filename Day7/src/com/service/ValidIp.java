package com.service;

public class ValidIp {
	public static int ipValidator(String address) {
		String str[] = address.split("\\.");
		for (int i = 0; i < str.length; i++) {
			if (Integer.parseInt(str[i]) < 256) {
			} else
				return 2;
		}
		str = null;
		return 1;

	}
}