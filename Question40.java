/*40.	Create a class Student having data members name, roll no., age and score. 
Write a program to accept 10 records of student and store them in an array. And then arrange
 the student records based on the score group [0-50], [50-65], [65-80], [80-100].*/
 import java.util.*;
 class Student{
	 public String name;
	 public int rollNo;
	 public int age;
	 public int score;
	 
	 Student(String name,int rollNo,int age,int score){
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score;
	 }
 }
 
 class Question40{
	 public static void main(String [] args){
		 Scanner sc =new Scanner(System.in);
		 Student dacStudent[];
		 dacStudent=new Student[10];
		 String n[] =new String[10];
		 int r[]=new int[10];
		 int a[]=new int[10];
		 int s[]=new int[10];
		 
		 for(int i =0;i<dacStudent.length;i++){
			 System.out.println("Enter Name ,Roll no, Age, and Score : ");
			 n[i]=sc.nextLine();
			 r[i]=sc.nextInt();
			 a[i]=sc.nextInt();
			 s[i]=sc.nextInt();
			 dacStudent[i]=new Student(n[i],r[i],a[i],s[i]);	 
		 }
		 for(int i=0; i<dacStudent.length;i++){
			System.out.println(" Name : "+dacStudent[i].name+" Roll No : "+dacStudent[i].rollNo+" Age : "+dacStudent[i].age+" Score : "+dacStudent[i].score);
		}
		 
	 }
 }