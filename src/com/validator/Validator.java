package com.validator;

public class Validator {

	public boolean validate(final String query) {
		if (query == null) {
			return false;
		}
		if (query.length() != 5) {
			return false;
		}
		final String[] temp = query.split(" ");
		try {
			Integer.parseInt(temp[0]);
			Integer.parseInt(temp[2]);
		} catch (Exception ex) {
			return false;
		}
		if (temp[1].equals("+") || temp[1].equals("-") || temp[1].equals("/") || temp[1].equals("*")) {
			return true;
		}
		return false;
	}
}
