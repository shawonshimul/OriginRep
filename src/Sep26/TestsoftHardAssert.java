package Sep26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsoftHardAssert {


	WebDriver driver;
	
	@BeforeMethod
		public void openbrowser() {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/");
	}
	
	@Test(priority=1)
	public void VerifyTitle() {
		String actualtitle = driver.getTitle();
		
		System.out.println(actualtitle);
		
		String ExpectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(actualtitle, ExpectedTitle);
		System.out.println("Title verified");
	}
	
	@AfterTest
	public void Closingbrowser() {
		driver.close();
	}
}
