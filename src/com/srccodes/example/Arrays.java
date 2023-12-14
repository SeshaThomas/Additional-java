package com.srccodes.example;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jagarray[][]= {{1,2,3,4},{2,6,5},{7,8,9,3},{1,2}};
		for(int i=0;i<jagarray.length;i++) {
			for(int j=0;j<jagarray[i].length;j++) {
			System.out.print(jagarray[i][j] + " ");
				
			}
			System.out.println();
			
		System.out.println("\nLength of row\n"+jagarray[i].length);
		}  
	}   
 
} 
