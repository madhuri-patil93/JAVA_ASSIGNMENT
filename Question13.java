/*13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator 
( logical operator) ]  */

import java.util.Scanner;
class Question13{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a>b && a>c){
			System.out.println("Greatest number:"+a);
		}else{
			if(b>c){
				System.out.println("Greatest number:"+b);
			}else{
				System.out.println("Greatest number:"+c);
			}
		}
	}
}