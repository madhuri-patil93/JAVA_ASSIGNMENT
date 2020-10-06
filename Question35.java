/*35.	Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
 parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns 
 the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. 
 power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
 Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation
 class by providing entered numbers and prints the return values of every method.*/
 
 class MathOperation{
	static int add(int a, int b){
		int ad= a+b;
		 return ad;
	}
	static int sub(int a, int b){
		 int s=a-b;
		 return s;
	}
	static int mul(int a, int b){
		int m=a*b;
		return m;
	}
	static int pow(int a, int b){
		int p=(int)Math.pow(a,b);
		return p;
	}
 }
 class Question35{
	 public static void main(String args[]){
		 int x=MathOperation.add(4,4);
		 System.out.println("Addition: "+x);
		 int y=MathOperation.sub(4,4);
		 System.out.println("Subtraction: "+y);
		 int z=MathOperation.mul(4,4);
		 System.out.println("Multiplication: "+z);
		 int t=MathOperation.pow(4,4);
		 System.out.println("Power: "+t);
	 }
 }