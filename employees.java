package day8;

public class employees {
	String Ename ;
	int Eid;
	double Esalary;
	long Ephonenumber;
	
		public static void main(String[] args)
		{
			employees emp1=new employees();
			emp1.Ename="harish";
			emp1.Eid=0001;
			emp1.Esalary=15000;
			emp1.Ephonenumber=9344941794l;
			
			System.out.println("Employee Name:"+emp1.Ename);
			System.out.println("Employee Id:"+emp1.Eid);
			System.out.println("Employee Salary:"+emp1.Esalary);
			System.out.println("Employee Number:"+emp1.Ephonenumber);
			
			employees emp2=new employees();
			emp2.Ename="karan";
			emp2.Eid=0002;
			emp2.Esalary=20000;
			emp2.Ephonenumber=8098264334l;
			
			System.out.println("Employee Name:"+emp2.Ename);
			System.out.println("Employee Id"+emp2.Eid);
			System.out.println("Employee salary:"+emp2.Esalary);
			System.out.println("Employee pnumber:"+emp2.Ephonenumber);
			
			
			
		}
	

}
