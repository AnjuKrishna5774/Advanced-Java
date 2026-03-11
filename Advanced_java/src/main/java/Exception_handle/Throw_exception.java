package Exception_handle;

public class Throw_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=1;
if(age>=18)
{
	System.out.println("Eligible for voting");
}
/*
 * else { throw new ArithmeticException("VotingAgeException"); }
 */
try {
    throw new Exception("VotingAgeException");
} catch (Exception e) {
    System.out.println(e.getMessage());
}
	
	}

}
