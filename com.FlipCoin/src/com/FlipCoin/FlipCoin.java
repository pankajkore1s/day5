package com.FlipCoin;

import java.util.*;

public class FlipCoin {
	public static void main (String []args) {
		int tail=0;
		int head=0;
		double headsPercentage;
		double tailsPercentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times coin to be flip");
		int number=sc.nextInt();
		double copyNumber= number;
		if (number>0) {
			for(int i=number;i>0;i--) {
				double random = Math.random();
				if(random<0.5)
					tail++;
				else
					head++;

			}
			headsPercentage=head/(double)number*100;
			tailsPercentage=tail/(double)number*100;
			System.out.println("percentage of heads:"+headsPercentage+"%");
			System.out.println("percentage of heads:"+tailsPercentage+"%");

		}
	}
}
