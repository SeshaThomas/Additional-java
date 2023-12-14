package com.srccodes.example;

public class Average {
	public static void main(String[] args) {
		int sum=0;
  int arr2D[][]= {{2,4,6,8}, {1,3,6,9},{2,8,12,16},{1,1,1,1}};
 System.out.println("Diagonal elements are: ");
  for(int i=0;i<arr2D.length;i++) {
	  for(int j=0;j<arr2D[i].length;j++) {
		  
	  }
	  System.out.print(" "+arr2D[i][i]);
	  sum=sum+arr2D[i][i];
  }
  System.out.println("\n Sum= "+sum);
	  
  }
  //float avg=sum/array.length;
  //System.out.println("Average= "+avg);
  
	} 


 
