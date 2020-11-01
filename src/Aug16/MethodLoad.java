package Aug16;

public class MethodLoad {
	
	MethodLoad(){
		System.out.println("i am no parameter constructor");
	}
	
	MethodLoad(String name){
		System.out.println("I am single parameter constructor");
	}

	public static void main(String[] args) {

		MethodLoad ml = new MethodLoad();
		
		
		
		System.out.println(Add(2,5,8));
		System.out.println(Add(30.21, 20.21));
		System.out.println(Add("Faisal ", "Mobarak ", "Shawon ", "Student of ", "Prosmart"));
		}
	
	
		public static int Add (int a, int b, int c) {
			return (a*b*c);
		}
		public static double Add (double a, double b) {
			return (a-b);
		}
		public static String Add(String a, String b, String c, String d, String e) {
			return (a+b+c+d+e);
}}
