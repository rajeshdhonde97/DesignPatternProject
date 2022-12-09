package com.velocity.custom.exception;

import java.util.Scanner;

public class AgeTest {
	
	void getData() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scanner.nextInt();
		
		if(age<18) {
			throw new AgeInvalidException("Sorry Your Age is below 18");
		}
		System.out.println("Your age is above 18 and you are ok");
	}

	

	

}
