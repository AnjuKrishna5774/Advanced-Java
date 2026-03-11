package Assignment8;

public class HDFC implements RBI {

	double amount=20000;
	double duration=2;
	@Override
	public double recurringDeposit(double amount, double duration) {
		// TODO Auto-generated method stub
		
		double return_amount=amount+(amount*interest_rate*duration)/100;
		return return_amount;
	}
public static void main(String[] args) {
	
	HDFC f1=new HDFC();
	double maturity=f1.recurringDeposit(f1.amount, f1.duration);
System.out.println("Deposited Amount="+f1.amount);
System.out.println("Duration of deposit="+f1.duration);
System.out.println("Maturity amount="+maturity);
}
}
