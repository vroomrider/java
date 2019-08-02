package com.java.practice.regexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexpressions {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("NOT ACTIVE");

		Matcher match = pattern.matcher("CFW      NOT ACTIVE");

		while (match.find()) {
			System.out.println("Pattern started from " + match.start() + " and ended at " + match.end());
		}
	}
}
