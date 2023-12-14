package com.srccodes.example;

public class CamelCase {

	  public static void main(String[] args) {
	        String str1 = "a brown fox jumped";
	        String newString = convertToCamelCase(str1);
	        System.out.println(newString);
	    }

	    private static String convertToCamelCase(String str1) {
	        StringBuilder camelCaseStringBuilder = new StringBuilder();

	        boolean capitalizeNext = false;

	        for (char c : str1.toCharArray()) { 
	            if (Character.isWhitespace(c)) {
	                capitalizeNext = true;
	            } else {
	                if (capitalizeNext) {
	                    camelCaseStringBuilder.append(Character.toUpperCase(c));
	                    capitalizeNext = false;
	                } else {
	                    camelCaseStringBuilder.append(Character.toLowerCase(c));
	                }
	            }
	        }

	        return camelCaseStringBuilder.toString();
	    }
	}
        
        