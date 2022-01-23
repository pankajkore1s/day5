package com.largestnumber;

import java.util.*;

public class largestnumber {
	public static void main (String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Three numbers=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();

		if(a>=b && a>=c)
			System.out.println(a+" is largest number");
		else if (b >=a && b>=c )
			System.out.println(b+" is largest number");
		else
			System.out.println(c+" is largest number");


	} 

}
