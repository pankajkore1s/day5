package com.quotientRemainder;

import java.util.*;

public class quotientRemainder {
	public static void main (String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
		int dividend=sc.nextInt();
		System.out.println("Enter divisor");
		int divisor=sc.nextInt();
		sc.close();

		int quotient=dividend/divisor;
		int remainder=dividend%divisor;

		System.out.println("quotient is= " + quotient);
		System.out.println("remainder is= " + remainder);
	}
}
