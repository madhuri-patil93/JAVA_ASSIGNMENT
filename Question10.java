/*10.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. 
	[ formula : C= 5*(f-32)/9 ]*/

import java.util.Scanner;
class Question10{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Tempreture in Fahrenheit:");
		float Fahren = s.nextFloat();
		float Celsius = 5*(Fahren-32)/9;
		System.out.println(Celsius);
	}
}