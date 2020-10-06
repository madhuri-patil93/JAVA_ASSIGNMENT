/*41.	Write a program to demonstrate this() construct functionality.*/
class Person{
		Person(){
			System.out.println("Person No Argu Constructor");
		}
		Person(int i){
			System.out.println("Person Argu Constructor");
		}	
}
class Empolyee extends Person{
		Empolyee(){
			
			System.out.println("Empolyee No Argu Constructor");
		}
		Empolyee(int i){
			this();
			System.out.println("Empolyee Argu Constructor");
		}	
}





class Question41{
	public static void main(String [] args){
		Empolyee e = new Empolyee(12);
	}
}