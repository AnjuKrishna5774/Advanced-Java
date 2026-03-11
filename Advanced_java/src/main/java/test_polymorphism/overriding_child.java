package test_polymorphism;

public class overriding_child extends overriding_parent {
	
	public void display(String s)
	{
		//super.display("Parent String");
		System.out.println("Child text to display="+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
overriding_child ch=new overriding_child();
ch.display("Child string");
overriding_parent obj=new overriding_child(); //using Upcasting
obj.display("Parent String");

		
	}

}
