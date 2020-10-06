class Outer{
	 class Foo{
		void m1(){
			System.out.println("Static class");
		}
	}
}
class Demo{
	public static void main(String[] args)
	{
		Outer o =new Outer();
		Outer.Foo ref =o.new Foo();
		ref.m1();
	}
}