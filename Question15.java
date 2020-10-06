/*15.	Accept person’s gender (character m for male and f for female), age (integer), as input and 
	then check whether person is eligible for marriage or not*/

import java.util.Scanner;
class Question15{
	public static void main(String args[]){
	Scanner s = new Scanner (System.in);
	System.out.println("Enter gender of prson:");
	String gender = s.next();
	System.out.println("Enter age of prson:");
	int age = s.nextInt();
	//System.out.println(gender);
	//System.out.println(age);
	if(gender.compareTo("male")==0 && age>21){
		System.out.println("Eligilble for Marriage");
	}else if(gender.compareTo("female")==0 && age>18){
		System.out.println("Eligilble for Marriage");
	}else{
		System.out.println("Not Eligilble for Marriage");
	}
	
	}
}