import java.util.*;
class StringReverse{
    public static void main(String []args)
	 {
	     Scanner sc=new Scanner(System.in);
   		 System.out.println("enter the string");
		 String str=sc.next();
		 int n=str.length();
		 String rev=" ";
		 for(int i=0;i<n;i++)
		  {
		     rev=rev+str.charAt(n-1-i);
		  }
		  
		  System.out.println("reverse string= "+rev);
	}
}