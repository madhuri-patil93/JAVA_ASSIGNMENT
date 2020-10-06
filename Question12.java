/*12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic
 salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98%
 of basic salary. If the employee's salary is input by the user write a program to find his gross salary. 
 [ formula : GS= Basic + DA + HRA ]*/

import java.util.Scanner;
class Question12{
	public static void main(String args[]){
		Scanner s = new Scanner (System.in);
		double ba, hra, da, gross;
		System.out.println("Enter basic Salary");
		ba = s.nextFloat();
		if(ba<10000){
			hra = ba*0.1;
			da = ba*0.9;
			
		}else{
			hra = 2000;
			da = ba*0.98;
		}
		
		gross = ba + da + hra;
		System.out.println("Gross Salary : "+gross);
	}
}