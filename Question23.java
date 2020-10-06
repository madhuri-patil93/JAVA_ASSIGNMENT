import java.util.Arrays;
class Question23{
	public static  void main(String [] args)
	{
		int [] arr = {31,7,6,45,21,9,101,102};
		int n = arr.length;   //length of array
		int[] b = new int[n]; //new array
		int j = n;
		for(int i =0; i<n;i++){
			b[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("REVERSE Array is:");
		for(int k = 0; k<n ; k++){
			System.out.println(b[k]);
		}
		
	}
}