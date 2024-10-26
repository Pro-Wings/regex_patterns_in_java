package com.prowings.regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestInputValidator {

	public static void main(String[] args) {

		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String PAN_PATTERN = "^[A-Z]{5}\\d{4}[A-Z]$";

		System.out.println("Plese enter email to validate : ");
		Scanner sc = new Scanner(System.in);
		String inputEmail = sc.nextLine();

		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher(inputEmail);

		if (matcher.matches())
			System.out.println("Valid!!!");
		else
			System.out.println("Invalid!!!");
		
//		sc.close();
		
		System.out.println("Plese enter PAN number to validate : ");
		Scanner sc2 = new Scanner(System.in);
		String inputPan = sc.nextLine();

		Pattern panPattern = Pattern.compile(PAN_PATTERN);

		Matcher panMatcher = panPattern.matcher(inputPan);
		
		if (panMatcher.matches())
			System.out.println("Valid!!!");
		else
			System.out.println("Invalid!!!");
		
		sc2.close();


	}

}
