/*32.	Modify the above program (no. 30) to count the no of Student objects created. 
[ In this program static variable is required ]P*/

class Student1{
	static int no;
	public int rollNo;
	public String name;
	
	Student1(){
		no++;
	}
	
	void setData(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	void show(){
		System.out.println("RollNO : "+rollNo+" Name : "+name);
		System.out.println("No of Student : "+no);
	}
}

class Question32{
	public static void main(String args[]){
		
		Student1 s =new Student1();
		s.setData(1,"Test1");
		s.show();
		
		Student1 s1 =new Student1();
		s1.setData(2,"Test2");
		s1.show();
		
		Student1 s2 =new Student1();
		s2.setData(3,"Test3");
		s2.show();
		
		Student1 s3 =new Student1();
		s3.setData(4,"Test4");
		s3.show();
		
		
	}
}