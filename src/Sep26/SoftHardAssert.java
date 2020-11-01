package Sep26;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssert {
	
	SoftAssert soft = new SoftAssert();
	//Object needed for soft assert, hard one have by default

	@Test
	public void TestCase1() {
		System.out.println("Launch site");
		//Assert.assertEquals(true, false); 
		//This is hard assert, don't need to create object
		
		System.out.println("Verify title of the page");
		
		soft.assertEquals(true, false);
		
		System.out.println("Entering email");
		
		System.out.println("Entering password");
		
		System.out.println("Clicking on sign in button");
		
		soft.assertAll();
		
	}
}
