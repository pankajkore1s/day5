package com.powerOf2;

import java.util.*;

public class powerOf2 {
	public static void main (String []args) {

		int number,multiplication=1;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int power=sc.nextInt();
		if( power > 31) {
			System.out.println("value should be less than 31");
			return;
		}
		else {
			System.out.println(multiplication);
			for (int i = 1; i<= power; i++) {
				multiplication = multiplication * 2;
				System.out.println(multiplication);
			}
		}
	}
}


