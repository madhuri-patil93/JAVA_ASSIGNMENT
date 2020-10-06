/*04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a 
	byte type of variable. [Note: primitive down casting is required in this program ] */

/*import java.util.Scanner;
class Question4{
	public static void main(String args[]){
		byte a,b, sum;
		int x, y, z;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter first number:");
		a = s.nextByte();
		x = a;
		System.out.println("Enter second number:");
		b = s.nextByte();
		y = b;
		z = x + y;
		sum = (byte)z;
		System.out.println("Result:"+sum);
	}
}*/

import java.util.Scanner;
class Question4{
	public static void main(String args[]){
		byte a,b, sum;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter first number:");
		a = s.nextByte();
		System.out.println("Enter second number:");
		b = s.nextByte();
		sum = (byte)(a+b);
		System.out.println("Result:"+sum);
	}
}