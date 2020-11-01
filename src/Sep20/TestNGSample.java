package Sep20;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSample {

	//precondition
	@BeforeTest
	public void openbrowser() {
		System.out.println("Browswer opened");
	}
	//step annotation
	@Test (priority=1)
	public void Registration() {
		System.out.println("User is able to register");
	}
	@Test(priority=2)
	public void Login() {
		System.out.println("User is able to Log in ");
	}
	@Test(priority=3)
	public void RegisterAddress() {
		System.out.println("User is able to register ");
	}
	@Test(priority=4)
	public void ProfileCreation() {
		System.out.println("User is able to create profiel ");
	}
	@Test(priority=5)
	public void Signoff() {
		System.out.println("User is able to sign off ");
	}
	//post-condition
	@AfterTest
	public void closebrowser() {
		System.out.println("User is able to close browser ");
	}
	
	//public static void main(String[] args) {
		
		
	
	//}

}
