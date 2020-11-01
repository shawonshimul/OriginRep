package Aug16;

class Encapsulations {
	
	private String FirstName;
	private String LastName;
	private String CollegeName;
	private int StudentID;
	private int ZipCode;
	
	public String getFName() {
		return FirstName;
	}
	
	public String getLName() {
		return LastName;
	}
	
	public String getCName() {
		return CollegeName;
	}
	
	public int getID() {
		return StudentID;
	}
	
	public int getZip() {
		return ZipCode;
	}
	
	public void SetFName(String FName) {
		FirstName = FName;
	}
	public void SetLName(String LName) {
		LastName = LName;
	}
	public void SetCollege(String College) {
		CollegeName = College;
	}
	
	public void SetID(int ID) {
		StudentID = ID;
	}
	
	public void SetZipCode(int ZCode) {
		ZipCode = ZCode;
}
	public void print(){
		
	System.out.println("First Name of the student is : "+getFName());
	System.out.println("Last Name of the student is : "+getLName());
	System.out.println("He study on : "+getCName());
	System.out.println("His student id is  : "+getID());
	System.out.println("He lives on ZipCode : "+getZip());
	
	System.out.println();
	}}
public class Encap {

	public static void main(String[] args) {
		Encapsulations obj = new Encapsulations();
		obj.SetFName("Faisal");
		obj.SetLName("Mobarak Shawon ");
		obj.SetCollege("Brooklyn College");
		obj.SetID(340);
		obj.SetZipCode(11208);
		
		obj.print();

	
	}
}
