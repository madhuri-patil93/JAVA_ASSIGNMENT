/*31.	Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and
 student name as parameter and stores them in data members rno and name. Create one more method showData() to print the 
 data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() 
 and showData() methods.*/

import java.util.*;
class Student{
	public int rollNo;
	public String name;
	
	void setData(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	void show(){
		System.out.println("RollNO : "+rollNo+" Name : "+name);
	}
}
class Question31{
	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Roll No : ");
		//int rollNo = sc.nextInt();
		//System.out.println("Enter name: ");
		//String name = sc.next();
		
		Student s =new Student();
		s.setData(1,"Test");
		s.show();
		
		
	}
}