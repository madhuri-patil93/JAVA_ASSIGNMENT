import java.util.Arrays;
class Question22{
	public static  void main(String [] args)
	{
		int [] arr =new int[10];
		arr=new int[3];
		arr =new int[] {31,7,6,45,21,9,101,102};
		
		Arrays.sort(arr);
		
		System.out.printf("Modified arr[] : %s",  Arrays.toString(arr));
	}

}