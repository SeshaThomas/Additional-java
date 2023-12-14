package com.srccodes.example;

public class StringManip {
	
	public static void main(String[] args) {
	String str1="Employee";
	String str2="Company";
	
	if(str1.equals(str2)) {
		System.out.println("Strings are equal");
	}
	else {
		System.out.println("Strings are not equal");
	}
	
	System.out.println("Length of the first string: "+str1.length());
	System.out.println("Length of the second string: "+str2.length());
	
	System.out.println("Substring of string 1 : "+str1.substring(4));
	System.out.println("Substring of string 2 : "+str2.substring(4));
	System.out.println("Concatenated String: "+str1.concat(str2));
	System.out.println("Lowercase of string 1 :"+str1.toLowerCase());
	System.out.println("Uppercase of string 1: "+str1.toUpperCase());
	System.out.println("Lowercase of string 2 :"+str2.toLowerCase());
	System.out.println("Uppercase of string 2: "+str2.toUpperCase());
	System.out.println("Index of 'lo' in Employee :"+str1.indexOf("lo"));
	 }
	 
         
}
