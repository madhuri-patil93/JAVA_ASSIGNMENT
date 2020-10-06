/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage.
 Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.*/
 
import java.util.Scanner;
class Question7{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i=5;
		System.out.println("enter mark of subject"+i);
		int s1	 = s.nextInt();
		int s2	 = s.nextInt();
		int s3	 = s.nextInt();
		int s4	 = s.nextInt();
		int s5	 = s.nextInt();		
		
		double per=(s1+s2+s3+s4+s5)/5;
		System.out.println(per);
	}
}