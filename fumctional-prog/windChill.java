package com.windChill;

import java.util.*;

public class windChill {
	static void windChill(double t,double ws) {
		double w =35.74+0.6215 * t +(0.4275 * t-35.75) *Math.pow(ws,0.16); 
		System.out.println(w);
	}
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Tempreture=");
		double t=sc.nextDouble();
		System.out.println("Enter Speed Of Wind/Hour=");
		double ws=sc.nextDouble();
		sc.close();
		if(t > 50 || ws > 120 || ws < 3)
		{
			System.out.println("Enter Valid Inputs");
		}
		else
		{
			windChill(t,ws);
		}
		
		
	}
}
