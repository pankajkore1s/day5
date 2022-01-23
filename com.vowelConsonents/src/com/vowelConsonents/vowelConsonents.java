package com.vowelConsonents;

import java.util.*;

public class vowelConsonents {

		public static void main (String []args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Alphabet=");
			char c=sc.next().charAt(0);
			
			///char a,e,i,o,u,A,E,I,O,U;
			if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
				c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
				System.out.println(c+ "is vowel");
			else
				System.out.println(c + " is consonent");
		}
}
