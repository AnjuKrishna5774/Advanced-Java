package Assignment8;

public class Fulltime_employeee extends Employee {
	public void Fulltime_employeee_details(String name)
	{
		
		super.name=name;
		System.out.println("Full time-employee name="+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fulltime_employeee f=new Fulltime_employeee();
f.Fulltime_employeee_details("Anu");
Contractor c=new Contractor("Dev");

System.out.println("Salary of full time employee="+f.calculatesalary());

System.out.println("Salary of contract employee="+c.calculatesalary());

	}

	@Override
	double calculatesalary() {
		// TODO Auto-generated method stub
		return paymentper_hours*8;
	}

}
