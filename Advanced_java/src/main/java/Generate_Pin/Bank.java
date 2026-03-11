package Generate_Pin;

public class Bank {
	private int pin;
	public void setpin(int pin)
	{
		this.pin=pin;
	}
	public boolean validatePin() {
        if (pin == 1001 || pin == 1234 || pin == 1212) {
            return true;
        }
        return false;
	}
	public void withdraw(double amount, double balance) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal is successful");
            System.out.println("Remaining balance = " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance");
        }
}
}
