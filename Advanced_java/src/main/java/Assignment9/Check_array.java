package Assignment9;

import java.util.ArrayList;
import java.util.Iterator;

public class Check_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> arr=new ArrayList<String>();//array list creation
arr.add("red");
arr.add("yellow");
arr.add("blue");
arr.add("black");
arr.add("yellow");
System.out.println("Array list="+arr);

//retrieve element in the index 3

System.out.println("Color at the index 3="+arr.get(3));

//iterate through all elements in an array list
Iterator<String> it=arr.iterator();

//Traverse list using iterator

while (it.hasNext()) {
    String color = it.next();
    System.out.println(color);
}

//Delete 3 rd element from the list

System.out.println(arr.remove(3));
System.out.println("After removing the element="+arr);

//Search an element in the array list

System.out.println(arr.contains("yellow"));
	}

}
