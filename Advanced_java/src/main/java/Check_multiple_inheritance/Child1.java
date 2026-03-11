package Check_multiple_inheritance;

public class Child1 implements Parent1,Parent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child1 ch=new Child1();
ch.parent1_diplay();
ch.parent2_diplay();
	}

	@Override
	public void parent1_diplay() {
		// TODO Auto-generated method stub
		System.out.println("Inherit parent1's properties");
		
	}
	@Override
	public void parent2_diplay() {
		// TODO Auto-generated method stub
		System.out.println("Inherit parent2's properties");
	}

}
