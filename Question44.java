/*44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print 
    salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class 
    inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula 
    (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class
    inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula 
	( workingHour * ratePerHour )*/
	
	class Faculty{
		public int facultyId;
		public int salary;
		
		Faculty(){}
		
		void input(int facultyId){
			this.facultyId=facultyId;
		}
		
		void printSalary(int salary){
			this.salary=salary;
			System.out.println("Salary : "+salary+ "Faculty id: "+facultyId);
			
		}
	}
	
	class FullTimeFaculty extends Faculty{
		public int basicSalary;
		public int allowance;
		
		FullTimeFaculty(){}
		
		void input(int facultyId,int basicSalary, int allowance){
			this.basicSalary=basicSalary;
			this.allowance=allowance;
			
			int result=basicSalary*allowance;
			super.printSalary(result);
			super.input(facultyId);
			
		}
	}
	
	class PartTimeFaculty extends Faculty{
		public int workingHours;
		public int ratePerHour;
		
		PartTimeFaculty(){}
		
		void input(int facultyId, int workingHours, int ratePerHour){
			this.workingHours=workingHours;
			this.ratePerHour=ratePerHour;
			int result = workingHours*ratePerHour;
			
			super.input(facultyId);
			super.printSalary(result);
			
		}
}
		
	
	
	class Question44{
		public static void main(String args[]){
			FullTimeFaculty ff = new FullTimeFaculty();
			PartTimeFaculty pf =new PartTimeFaculty();
			//ff.input(100,200,300);
			pf.input(300,400,500);
		}
	}
	