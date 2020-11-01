package Aug22;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		/*try
		{
		int a=5, b=0, result;
		result = a/b;
		
		System.out.println(result);
	
	}
		catch(Exception x) {
			System.out.println("Divide by zero out is : "+x);
		}

}
}  */
		try {
		int a[] =new int[5];
		a[1]=11;
		a[2]=20;
		a[3]=50;
	}
		catch(Exception x) {
			System.out.println(x);
		}
		
	}}