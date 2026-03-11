package find_salary;

public class total_salary extends hra_pf {
	
	public void salary_slip()
	{
		double total_salary_in_hand=basic_pay+hra+bonus-pf-deduction;
		System.out.println("\n----SALARY SLIP-------\n");
		System.out.println("Basic Pay="+basic_pay);
		System.out.println("Deduction="+deduction);
		System.out.println("HRA="+hra);
		System.out.println("PF="+pf);
		System.out.println("Bonus="+bonus);
		System.out.println("Cash in Hand="+total_salary_in_hand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
total_salary tn=new total_salary();
tn.calculate();
tn.salary_slip();
	}

}
