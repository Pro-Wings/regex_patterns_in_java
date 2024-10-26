package com.prowings.regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexInJava {
	
	public static void main(String[] args) {
		

		//		String regexPatternForEmail = "^(.+)@(.+)$";
//		String regexPatternForEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
//		String regexPatternForEmail = "^[\\\\w!#$%&’*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
		String regexPatternForEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		System.out.println("Plese enter email to validate : ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputEmail = sc.nextLine();
		
		Pattern pattern = Pattern.compile(regexPatternForEmail);
		
		Matcher matcher = pattern.matcher(inputEmail);
		
		if(matcher.matches())
			System.out.println("Its a valid email!!!");
		else
			System.out.println("Its a invalid email!!!");
			
	}

}
