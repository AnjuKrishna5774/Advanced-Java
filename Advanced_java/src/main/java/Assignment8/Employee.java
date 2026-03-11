package Assignment8;

abstract class Employee {

String name;
double paymentper_hours=800;
public void employee_details(String name)
{
	
this.name=name;
}

abstract double calculatesalary();
}
