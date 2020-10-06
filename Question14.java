/*14.	Program to check that entered year is a leap year or not.*/

import java.util.Scanner;
class Question14{
	public static void main(String args[]){
	Scanner s =new Scanner(System.in);
	System.out.println("Enter Year:");
	int year = s.nextInt();
	if (year%4==0){
		if(year%100==0 && year%400!=0){
			System.out.println("Not Leapyear");
		}else{
			System.out.println("Leapyear");
		}
	}else{
			System.out.println("Not Leapyear");
		}
	}
}