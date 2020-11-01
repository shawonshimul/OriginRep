
public class SalaryValue {

	public static void main(String[] args) {
		
		String Name = "Shawon";
		int Employee_id = 34012;
		String Position = "QA Analyst";
		int Salary = 10000;
		
		if(Salary>=15000) {
		
			System.out.println("Employee name : "+Name);
			System.out.println("Employee ID : "+Employee_id);
			System.out.println("Current position of the employye is : "+Position);
			System.out.println("He Salary is : "+Salary);
			
		}
		else if (Salary<=15000) {
			System.out.println("Employee name : "+Name);
			System.out.println("Employee ID : "+Employee_id);
			System.out.println("Current position of the employye is : "+Position);
			System.out.println("He get very poor payment, need to improve salary");
		}
		else {
			System.out.println("Please enter correct salary ");
		}
	}

}
//It Should print the salary value if the salary is more than 15000.
//If it's less than 15000 think about what it will do?
