package com.ownException;

import java.util.Scanner;

public class TestWeight {
	
	void getWeightData() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your weight");
		int weight=scanner.nextInt();
		
		if(weight<50) {
			throw new InvalidWeightException("Your Weight is less please Increase Your Weight");
		}
		System.out.println("Your Weight is Ok");
	}
	
	

}
