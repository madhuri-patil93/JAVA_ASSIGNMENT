import java.util.*;
class Question24{
	public static  void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int [] a =new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the elements to be search");
		int search = sc.nextInt();
		/*Perform Search Operation*/
		for(int j=0;j<n;j++){
			if (a[j]==search){
				System.out.println("Element "+search+" found at "+j+"th"+" position");
				flag=1;
				break;
			}
		}
			
		if(flag==0){
			System.out.println("Element "+search+" not found");
		}
	}
}