package com.prowings.regexdemo;

import java.util.Scanner;

public class TestEmailValidator {
	
	public static void main(String[] args) {
		
		EmailValidator validator = new EmailValidator();
		
		System.out.println("Plese enter email to validate : ");
		Scanner sc = new Scanner(System.in);
		String inputEmail = sc.nextLine();
		
		if(validator.validate(inputEmail))
			System.out.println("Valid!!!");
		else
			System.out.println("Invalid!!!");
			
		
	}

}
