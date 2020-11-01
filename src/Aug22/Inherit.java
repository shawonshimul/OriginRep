package Aug22;

class vehichle{
	String Model;
	int Max_Speed ;
	String Color;
	String Transmission;
		
	public void Print1() {
		System.out.println("The model of the car is : "+Model);
		System.out.println("The Max Speed of the car is : "+Max_Speed);
		System.out.println("The Color of the car is : "+Color);
		System.out.println("The Transmission system is : "+Transmission);
		
	}
}


class Toyota extends vehichle{
	String Roof;
	void Print2() {
		Print1();
		System.out.println("The car roof is : "+Roof);
	
	}
}

class BMW extends Toyota{
	
		
		String SideDoor;
		
		 void Print3() {
			Print2();
			System.out.println("The side door is : "+SideDoor);
		 }
}



public class Inherit {

	public static void main(String[] args) {

		Toyota t = new Toyota();
		t.Model = "Toyota Camry 2007";
		t.Color = "Black";
		t.Max_Speed = 180;
		t.Transmission="Automatic";
		t.Roof ="Close";
		
		t.Print2();
		System.out.println();
		
		BMW b = new BMW();
		b.Model = "BMW 370i";
		b.Color = "Black";
		b.Max_Speed = 220;
		b.Transmission="Manual";
		b.Roof ="Open";
		b.SideDoor = "Fantastic";
		
		b.Print3();
		System.out.println();
		
	}

}
