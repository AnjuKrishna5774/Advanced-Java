package aggregation;

public class agg_child {
	
	int c,d;
	agg_parent ag; //referance of agg_parent class
	public void demo(int c,int d,agg_parent ag)
	{
		this.c=c;
		this.d=d;
		this.ag=ag;
	}
public void print()
{
	System.out.println("Value of parent class a="+ag.a);
	System.out.println("Value of parent class b="+ag.b);
	System.out.println("Value of child class c="+c);
	System.out.println("Value of child class d="+d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
agg_parent ag1=new agg_parent();
ag1.display(10, 20);
agg_child ag2=new agg_child();
ag2.demo(2, 4, ag1);
ag2.print();
	}

}
