/*37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of 
Person class by creating Person object and calling methods.*/

class Person{
	public String name;
	public int age;
	
	Person(String name){
		this.name=name;
		this.age=18;
	}
	void display(){
		System.out.println("Name "+name+" Age : "+age);
	}
	
}		
class Question37{
	public static void main(String [] args){
		Person z = new Person("Spruha");
		z.display();
		
		
	}
}
