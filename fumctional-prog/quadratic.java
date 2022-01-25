package com.quadratic;

import java.util.*;

public class quadratic {
	static void roots(int a,int b,int c){
		int delta = b*b - 4*a*c;
		double R1 = (-b +Math.pow(delta,0.5))/(2*a);
		double R2 = (-b -Math.pow(delta,0.5))/(2*a);
		System.out.println(R1);
		System.out.println(R2);
	}
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a=");
		int a=sc.nextInt();
		System.out.println("Enter Value of b=");
		int b=sc.nextInt();
		System.out.println("Enter Value of c=");
		int c=sc.nextInt();
		sc.close();
		roots(a,b,c);
	}
}
