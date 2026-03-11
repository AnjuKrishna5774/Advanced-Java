package Check_cloth_discount;

public class On_Season extends Off_Season{

	double price;
	public double find_discount(double price)
	{
		System.out.println("ON SEASON DISCOUNT");
		System.out.println("Total purchased amount"+price);
		return price - (price * 0.20);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean purchasedclothes=true;
		if(purchasedclothes)
		{
			Off_Season c1=new On_Season();//upcasting
			Off_Season c2=new Off_Season();
			
			System.out.println("Amount After discount at On season sale="+c2.find_discount(1000));
			
			
			  On_Season obj2=new On_Season();
			  
			  System.out.println("Amount After discount at Off season sale="+obj2. find_discount(1000));
			 
		}
		else
		{
			System.out.println("Discount not applicable");
		}
	}

}
