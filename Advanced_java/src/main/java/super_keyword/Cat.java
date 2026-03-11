package super_keyword;

public class Cat extends Animal{
	int leg_number=6;
	public void display() {
		
		System.out.println("Print PARENT CLASS ANIMAL LEG="+super.leg_number);//point parent class variable
		System.out.println("Child class animal leg="+leg_number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.display();

	}

}
