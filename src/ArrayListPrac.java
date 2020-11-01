import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac {

	public static void main(String[] args) {
	
		ArrayList<String> car = new ArrayList<String>();
		car.add("shawonIT");
		car.add("love");
		car.add("lover");
		
		//car.remove(2); //to remove an item
		
		car.set(1,"shimul"); //to change a value
		//System.out.println(car.size());
		System.out.println(car); //to print all list together
		//System.out.println(car.get(0)); //to print one item from the list
		
		for (int j=0;j<car.size();j++) {
			System.out.println(car.get(j));
		}
		System.out.println("next line is for iterator");
		Iterator<String> it= car.iterator();
		System.out.println(it.next());
		
		
		
		String name = "shawon";
		StringBuffer na = new StringBuffer(name);
		System.out.println(na.reverse());
		
		for (int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	
		
		
	}

}
