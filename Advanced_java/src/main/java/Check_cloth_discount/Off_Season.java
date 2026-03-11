package Check_cloth_discount;

public class Off_Season {
	double price;
	public double find_discount(double price)
	{
		System.out.println("ON SEASON DISCOUNT");
		System.out.println("Total purchased amount"+price);
		return price - (price * 0.15);
		
	}

}
