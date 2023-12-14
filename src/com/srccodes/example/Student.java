package com.srccodes.example;

public class Student {
	static int batch;
	String name;
	static int rollno;
	Week labday;
	
	Student(){
		name="default";
		rollno=0;
		
	}
	 enum Week{
		MON, TUE, WED, THU, FRI, SAT, SUN
 
	}
	
	Student(String stdname,int stdroll){
      name=stdname;
      rollno=stdroll; 
}
	Student(String stdname,int stdroll,Week lday){
	      name=stdname;
	      rollno=stdroll;
	      labday = lday;
	}
	
	      
	String introduce() {
		return "My name is " +name+" and Rollno is "+rollno+" and labday is "+labday;
		
	}
	
	public static void main(String[] args) {
		//Student ron=new Student("Ron",2); 
		Student simi=new Student("Simi",3,Week.MON); 
		

	 //	if(rollno>=1&&rollno<=2) {
	//		batch=1;
	//	}
	//	else if(rollno>=3&&rollno<=4) {
	//		
	//		batch=2;
		//	}
//		else if(rollno>=5&&rollno<=6) { 
	//		batch=3;
	//	}
	//	else {
	//		batch=0; 
	//	}
		
		
   //String s =ron.introduce(); 
	String r=simi.introduce();
	//	System.out.println(s);
		System.out.println(r); 
		//System.out.println("My batch is "+batch);
		
	switch(rollno=3) {
 case 1:
			System.out .println(" Batch 1");
		break;
		case 2:
			System.out .println("Batch 1");
			break; 
		case 3:
			System.out .println("Batch 2");
			break;
		case 4:
			System.out .println("Batch 2");
			break;
		case 5:
			System.out .println("Batch 3");
			break;
		case 6:
			System.out .println("Batch 3"); 
			break;
		}  
	} 
	 
} 
