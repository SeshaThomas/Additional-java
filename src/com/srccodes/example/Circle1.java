package com.srccodes.example;

public class Circle1{
	public int r;
	private String color;
		private String material;

	

	
			
		Circle1(int r, String color, String material){
			this.r = r;
			this.color = color;
			this.material = material;
		}

		public double area() {
			double x = 3.14*r*r;
			return x;
		}

		@Override
		public boolean equals(Object obj) {
			Circle1 c2 = (Circle1)obj;
			return this.r == c2.r && this.color.equals(c2.color) ;


		}

		//if two equal return true then there hashcode be same.
		@Override
		public int hashCode() {
			return this.r+this.color.length()+this.material.length(); 

		}

		
			
		

		public static void main(String[] args) {

			Circle1 c1 = new Circle1(7,"Blue","Steel");
			
			//System.out.println("Area is " + c.area());
			
			Circle1 c2 = new Circle1(7,"Blue","Plastic"); 
			//System.out.println("Area is " + c2.area());
			
			System.out.println(c1.equals(c2));
			System.out.println(c1.hashCode());
			
			
		}} 
	

	
