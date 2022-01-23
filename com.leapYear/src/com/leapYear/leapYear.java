package com.leapYear;

import java.util.*;

public class leapYear {
	public static void main (String []args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Four Digit Year");
		year=sc.nextInt();
		sc.close();

		if (( year % 400 == 0 ) || (( year % 4 == 0 ) && ( year % 100 != 0 )))
			System.out.println( "year "+ year + " is leap year");
		else
			 System.out.println( "year " + year + " is not leap year");


	}
}
