package collection;

import java.util.List;
import java.util.LinkedList;

public class List_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> l1=new LinkedList<>(List.of(2,5,1,8,1));
		
		
		System.out.println(l1);
		l1.add(3);
		System.out.println(l1);
		
		System.out.println(l1.get(1));
		
		System.out.println(l1.set(3,9));
		
		System.out.println(	l1.size());
	
		System.out.println(l1.isEmpty());
		
		System.out.println(	l1.remove(0));
	
		System.out.println(l1.contains(1));
		
		System.out.println(l1.indexOf(1));
		
		System.out.println(	l1.lastIndexOf(1));
	




	}

}