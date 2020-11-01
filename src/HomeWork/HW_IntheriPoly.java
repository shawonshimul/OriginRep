package HomeWork;

 class Professor1 {
	String Pname = "Monir Ahmed";
	String position = "Professor";
	int Join = 2005;
	String acceptance = "Popular";

	public void print() {
		System.out.println("Name of the teacher is : "+Pname);
		System.out.println("He is a : "+position);
		System.out.println("He joined on : "+Join);
		System.out.println("He is ver : "+acceptance);
	}}
 
 class Student11 extends Professor{
		
		String name = "Faisal Mobarak ";
		int GYear = 2015;
		double GPA = 3.94;

		public void print() {
			System.out.println("Name of the student is : "+name);
			System.out.println("His class teacher name : "+Pname);
			System.out.println(name+" graduate on : "+GYear);
			System.out.println("He achieve GPA : "+GPA);
			
		}}
 
class Student22 extends Student11{

		String name = "Nahim Mobarak ";
		int GYear = 2016;
		double GPA = 3.84;
		
		public void print() {
			System.out.println("Name of the student is : "+name);
			System.out.println("His class teacher name : "+Pname);
			System.out.println(name+" graduate on : "+GYear);
			System.out.println("He achieve GPA : "+GPA);
			
		}}

class Student33 extends Student22 {

	String name = "Bablu Mojumder ";
	int GYear = 2015;
	double GPA = 3.74;
	
	public void print() {
		System.out.println("Name of the student is : "+name);
		System.out.println("His class teacher name : "+Pname);
		System.out.println(name+" graduate on : "+GYear);
		System.out.println("He achieve GPA : "+GPA);
		
	}}

 
public class HW_IntheriPoly {

	public static void main(String[] args) {
		
		Professor1 prof = new Professor1();
		prof.print();
		System.out.println();
		
		Student11 st11 = new Student11();
		st11.print();
		System.out.println();
		
		Student22 st2 = new Student22();
		st2.print();
		System.out.println();
		
		Student33 st3 = new Student33();
		st3.print();
		
	}}
