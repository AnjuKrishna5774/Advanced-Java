package Generate_Pin;

public class User extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             User s=new User();
             int enteredPin = 1234;   
             double amount = 1000;    
             double balance = 5000;  
             s.setpin(enteredPin);//assigning pin value 
             if (s.validatePin()) {
                 System.out.println("PIN verified");
                 s.withdraw(amount, balance);
             } 
             else
             {
                 System.out.println("Invalid PIN");
             }

	}

}
