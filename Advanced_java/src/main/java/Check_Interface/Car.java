package Check_Interface;

public class Car implements Vehicle{
	public void show()
	{
		
		System.out.println("Has 4 Wheel");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj=new Car();
		obj.display();
		obj.show();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Can Drive using Diesel");
	}

}
