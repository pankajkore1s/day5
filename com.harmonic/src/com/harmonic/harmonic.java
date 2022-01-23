package com.harmonic;

import java.util.*;

public class harmonic {
	public static void main (String []args) {
		double result = 0, num = 0, j;
		result=1;
		// INPUT DATA
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the harmonic you want to find: ");
		int n=sc.nextInt();
		sc.close();
		// COMPUTATION
		for (j = 1; j <= n; j++) {
			result= result + (1 / j);
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int number=sc.nextInt();
		//sc.close();
		//double i;
		//double sum=0;	
		//for( i=1;i<=number;i++)
			//{
			//	sum=sum+(1/i);
			//}
		//System.out.println("Harmonic value = "+sum);
	//}		
//}













