package Assignment8;

public class Contractor extends Employee {

	public Contractor(String name)
	{
		super.name=name;
		System.out.println("Contract-employee name="+name);
		
	}

	@Override
	double calculatesalary() {
		// TODO Auto-generated method stub
		return paymentper_hours*6;
	}


}
