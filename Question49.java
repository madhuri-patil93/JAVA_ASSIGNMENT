/*
   49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
*/

interface Taxable{
  public final static double salesTax=0.07;
  public final static double incomeTax=0.105;
  void calcTax();
  
}

class Employee implements Taxable{
      int empId;
	  String name;
	  double salary;
      Employee(int empId,String name,double salary){
	       this.empId=empId;
		   this.name=name;
		   this.salary=salary;
	  }
	  
	  public void calcTax(){
	      double tax=salary*incomeTax;
		  System.out.println("tax="+tax);
	  }
}

class Product implements Taxable{
    int pid;
	double price;
	int quantity;
    Product(int pid,double price,int quantity){
	    this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void calcTax(){
	      double tax=price*quantity*salesTax;
		  System.out.println("tax="+tax);
	  }
}

class Demo{
    public static void main(String[] args){
	       Employee e=new Employee(1,"mehul",20000);
		   e.calcTax();
		   Product p=new Product(1,25000,2);
		   p.calcTax();
	}
}