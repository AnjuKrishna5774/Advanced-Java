package abstraction;

public class Abstract_child extends Abstract_parent{

	
	public void child_method()
	{
		System.out.println("Child class");
	}
	public void display()//override
	{
		System.out.println("IS it works correctly???");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract_parent obj=new Abstract_child(); //upcasting
obj.parent_method();
obj.display();
Abstract_child obj2=new Abstract_child();
obj2.child_method();
obj2.display();
	}

}
