package Aug15;

public class LogicalAnd {

	public static void main(String[] args) {
	
		int a = 5;
		int b= 10;
		int c= 15;
		
		if (a>b & b<c) {
			System.out.println("b less then c ");
		}
		else if ( a<b & b<c) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("logic not match");
		}
	}

}
