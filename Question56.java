import java.util.*;
class WholeLineReverse{
    public static void main(String []args)
	 {
	     Scanner sc=new Scanner(System.in);
   		 System.out.println("enter the string");
		 String str=sc.nextLine();
		 int n=str.length();
		 String capitalWord="";
		// char arr[]=str.toCharArray();
		String arr[]=str.split(" ");
		  for(String w:arr)
		  {
			  String firstWord=w.substring(0,1);
              String capitalFirst=firstWord.toUpperCase();
              String lastWords=w.substring(1);
              capitalWord+=capitalFirst+lastWords+" ";			  
		  }
		 for(String w:arr)
		 {
			 System.out.print(w);
		 }
	}
}