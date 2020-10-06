/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking
 carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class Question3{
	public static void main(String args[]){
		int y;
		int x;
		int z;
		
		x=2;
		y=(x*x)+(3*x)-7;
		System.out.println("y="+y);
		
		y=x++ + ++x;
		System.out.println("x="+x+" "+"y="+y);
		
		z=x++ - --y - --x + x++;
		System.out.println("x="+x+" "+"y="+y+" "+"z="+z);
		
		
	}
}

/*
import java.util.*;
class Expression{
    public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the no.");
	   int x=sc.nextInt();
	   int y=((x*x)+3*x-7);
	   System.out.println(y);
	   y=x++ + ++x;
	   System.out.println(x);
	   System.out.println(y);
	   int z =x++ - --y - --x  +  x++;
       System.out.println("x="+x+" y ="+y+" z="+z);
       //boolean m=(x && y || !(x || y))?true:false;
	   //System.out.println(m);
	}

}
*/