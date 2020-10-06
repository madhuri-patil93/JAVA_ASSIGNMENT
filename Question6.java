/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
 Then calculate and print the area and circumference of the circle.*/

import java.util.Scanner;
class Question6{
	public static void main(String args[]){
		int rad;
		double pi,area,circm;
		pi=3.14;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		rad = s.nextInt();
		area= pi*rad*rad;
		circm= 2*pi*rad;
		System.out.println("Area= "+area+" cicumferance= "+circm);
		
	}
}
