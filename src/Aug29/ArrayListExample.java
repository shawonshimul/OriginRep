package Aug29;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args)  {
		
		List<String> val = new ArrayList <>();
		val.add("Tv");
		val.add("Is");
		val.add("Awesome");
		
		for (int i=0;i<val.size();i++) {
			System.out.println(val.get(i));
			


			
		}
	}
 
}
