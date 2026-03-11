package find_salary;

public class hra_pf extends Payment_details {
	
	double hra;
	double pf;
	public void calculate()
	{
		
		hra=basic_pay*20/100;
		pf=basic_pay*12/100;
		//System.out.println("HRA="+hra);
		//System.out.println("PF="+pf);
	}

}
