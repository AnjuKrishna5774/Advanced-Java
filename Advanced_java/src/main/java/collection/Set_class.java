package collection;
import java.util.Set;
import java.util.HashSet;

public class Set_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> s1=new HashSet<Integer>();
Set<Integer>s2=new HashSet<Integer>();
s1.add(2);
s1.add(6);
s1.add(7);
s1.add(1);
System.out.println("First set="+s1);

s2.add(2);
s2.add(9);
s2.add(3);
System.out.println("First set="+s2);
s1.addAll(s2);
System.out.println("Complete set="+s1);
System.out.println(s1.size());
System.out.println(s1.isEmpty());
System.out.println(s1.contains(9));
System.out.println(s2.containsAll(s1));//check if all elements of s1 in s2
s1.remove(3);
System.out.println("After removing="+s1);
s1.removeAll(s2);
System.out.println("After removal="+s1);
s2.clear();
System.out.println(s2);
	}

}
