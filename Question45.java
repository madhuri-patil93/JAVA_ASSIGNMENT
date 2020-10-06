/*45.	Create a class Student with two members : rollno and percentage. Create default and parameterized constructors.
 Create method show() to display information. Create another class CollegeStudent inherits Student class. 
 Add a new member semester to it. Create default and parameterized constructors. Also override show() method that calls
 super class show() method and displays semester. Create another class SchoolStudent inherits Student class. Add a new member
 className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also override show() method that calls
 super class show() method and displays className. Create a class( say Demo) with main method that carries out the operation 
 of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two 
 CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- 
 search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many 
 students are having A grade, if for A grade percentage >75. */
 import java.util.*;
 class Student{
	 public int rollno;
	 public float percentage;
	 
	 Student(){}
	 
	 Student(int rollno, float percentage){
		 this.rollno=rollno;
		 this.percentage=percentage;
	 }
		 
	 void show(){
		 System.out.println("Rollno : "+rollno+" percentage : "+percentage);
	 }	 
 }
 
 class CollegeStudent extends Student{
	 public int semester;
	 
	 CollegeStudent(){}
	 
	 CollegeStudent(int rollno, float percentage, int semester){
		 super(rollno,percentage);
		  this.semester=semester;
	 }
	 void show(){
		 super.show();
		 System.out.println("semester : "+semester);
	 }	
 }
 
 class SchoolStudent extends Student{
	 public int className;
	 
	 SchoolStudent(){}
	 
	 SchoolStudent(int rollno, float percentage, int className){
		 super(rollno , percentage);
		 this.className=className;
	 }
	 void show(){
		 super.show();
		 System.out.println("className : "+className);
	 }
 }
 class Question45{
	 public static void main(String [] args){
		Student c[]={new CollegeStudent(),new CollegeStudent(),new SchoolStudent(),new SchoolStudent(),new SchoolStudent()};
			Scanner sc = new Scanner(System.in);
			for(int i=0; i<c.length;i++){
				if (c[i] instanceof CollegeStudent){
					System.out.println("rollno");
				  int rollNo=sc.nextInt();
				  System.out.println("percentage");
				  Float percentage=sc.nextFloat();
				  System.out.println("semester");
				  int semester=sc.nextInt();
				   c[i]=new CollegeStudent(rollNo,percentage,semester);
				}
				else{
					System.out.println("rollNo");
					int rollNo = sc.nextInt();
					System.out.println("percentage");
					Float percentage = sc.nextFloat();
					System.out.println("classname");
					int className = sc.nextInt();
					Student s = new SchoolStudent(rollNo,percentage,className);
					c[i]=s;
				}
				
			}
			for(Student s:c)
			{
				s.show();
			}
			
			System.out.println("Enter the Rollno, you want to search");
			int num = sc.nextInt();
			int count = 0;
			for (int i=0;i<c.length;i++)
			{
				if(c[i].rollNo==num)
				{
					System.out.println("rollno. found");
					if(c[i] instanceof SchoolStudent)
					{
						System.out.println("thi is school student");
					}
					else{
						System.out.println("this is college student");
					}
				}
			
				if(c[i].percentage>75)
				{
					count++;
				}
			}
			System.out.println("Count of std having A grade : "+ count);
		 
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 