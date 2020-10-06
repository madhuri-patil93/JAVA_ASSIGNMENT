/*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from
	user using Scanner class.*/
import java.util.Scanner;
class Question8{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		int principle = s.nextInt();
		System.out.println("Enter Interest Rate: ");
		float rate = s.nextInt();
		System.out.println("Enter year: ");
		int year = s.nextInt();
		
		double interest = (principle*rate*year)/100;
		System.out.println(interest);
		
	}
}