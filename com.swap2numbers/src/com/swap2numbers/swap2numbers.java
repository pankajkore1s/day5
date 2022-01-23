package com.swap2numbers;

import java.util.*;

public class swap2numbers {
	public static void main (String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number=");
		int A=sc.nextInt();
		System.out.println("Enter Second Number=");
		int B=sc.nextInt();
		sc.close();
		
		A=A+B;
		B=A-B;
		A=A-B;
	
		System.out.println("After swap A= " + A);
		System.out.println("After swap B= " + B);
		
	}
}
