package Sep27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertWork {

	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
}

	@Test(priority=1)
	public void Question1() {
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		String ExpectedTitle = "My Store wrong";
		Assert.assertEquals(actualtitle, ExpectedTitle);
		System.out.println("Title verified");
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirt");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	
	}
	
	
@Test(priority=2)
public void Serach() {

	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Shirt");
	
	String shirttitile = driver.getTitle();
	String shirtExpected = "My Store wrong";
	Assert.assertEquals(shirttitile, shirtExpected);
	System.out.println("Title verified");
	
}

@Test(priority=3)
public void click() {
	
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	String searchTitle = driver.getTitle();
	String searchExpected = "Search - My Store";
	Assert.assertEquals(searchTitle, searchExpected);
	System.out.println("Title verified");	
}

@AfterTest
public void Closingbrowser() {
	driver.close();
}
}
