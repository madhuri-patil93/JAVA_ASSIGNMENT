/*18.	Program to check whether number is prime or not.*/

import java.util.Scanner;
class Question18{
	public static void main(String args[]){
			Scanner s = new Scanner (System.in);
			System.out.println("Enter Number");
			int num = s.nextInt();
			if(num==0 || num==1 || num==2){
				System.out.println("Number is not Prime");
			}else{
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					System.out.println("Number is not prime");
					break;
				}else{
					if(i==num/2){
						System.out.println("Number is prime");
					}else{
					continue;
					}
				}
			}
		}		
	}
}
	


