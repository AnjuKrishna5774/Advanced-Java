package super_method;

public class Rose extends Flower{
	public void flowercolor()
	{
		
		System.out.println("Color is rose");
	}
	public void Fragrance()
	{
		super.Fragrance();//Calling same method from parent class using super keyword
		System.out.println("Rose has strong Fragrance");
		}
	public void Number_petal(int n)
	{
		super.Number_petal(10);
		System.out.println("Number of Rose petal is"+n);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r=new Rose();
		r.color();
		r.flowercolor();
		r.Fragrance();
		r.Number_petal(6);
	}

}
