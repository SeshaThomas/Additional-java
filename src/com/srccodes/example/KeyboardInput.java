package com.srccodes.example;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("Enter an integer: ");
		 Scanner sc=new Scanner(System.in);
		 int x=sc.nextInt();
		 System.out.println("Enter a string: ");
		 String str=sc.next();
		 System.out.println("Enter a line: ");
		 System.out.printf("The ineger is %d and the string is %s  ",x,str);
		 
	} 

}
