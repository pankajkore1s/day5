package com.distanc;

import java.util.*;

public class distanc{
	static void calculate(int x, int y) {
		System.out.println("Euclidean distance is " + Math.pow((x * x + y * y),0.5));
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for x");
		int x = sc.nextInt();
		System.out.println("enter value for y ");
		int y = sc.nextInt();
		calculate(x, y);
		sc.close();
	}
}

