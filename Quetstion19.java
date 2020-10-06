
/*19.	Calculate  series : 12+22+32+42+.........+n2*/

import java.util.Scanner;
class Quetstion19{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	int num = s.nextInt();
	int result=0;
	for(int i=1;i<=num;i++){
	result=result+(10*i+2);	
	}
	System.out.println(result);
	}
}