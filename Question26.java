import java.util.*;
class ArrayEle{
    public static void main(String[] args)
	  {
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter no. of rows");
		  int rows=sc.nextInt();
		  int arr[][]=new int[rows][];
		  int total=0;
		  for(int i=0; i<arr.length;i++)
		   {
		     System.out.println("enter the cols for the row"+i);
			 int cols=sc.nextInt();
			 arr[i]=new int[cols];
		     for(int j=0;j<arr[i].length;j++){
			      System.out.println("enter the col"+j+"element");
			      arr[i][j]=sc.nextInt();
			 }
		   }
		   for(int i=0;i<arr.length;i++)
		    {
			   for(int j=0;j<arr[i].length;j++)
			     {
				       total=total+arr[i][j];
				 }
			}
			
			System.out.println("sum of array elements= "+total);
	  
	  }
}