/*17.	Write a program to reverse a given number.*/

class Question17{
	public static void main(String args[]){
		int num = 1234321;
		int num1 = num;
		int tem=0;
		int rev=0;
		while(num>0){
		tem = num%10;             //4   //3
		num=num/10;               //123 //12
		rev= (rev*10)+tem;        //4   //43
		
		}
		System.out.println(rev);
		if (num1==rev){
			System.out.print("Number is pallindrom");
		}else{
				System.out.print("Number is not pallindrom");
		}
	}
}