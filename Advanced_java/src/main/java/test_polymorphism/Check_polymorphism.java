package test_polymorphism;

public class Check_polymorphism {
public void findsum(int a,int b)
{
	int c=a+b;
	System.out.println("Sum of two numbers"+c);
}
public void findsum(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println("Sum of three numbers="+d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_polymorphism c=new Check_polymorphism();
		c.findsum(3, 2);
		c.findsum(2, 3, 5);
	}

}
