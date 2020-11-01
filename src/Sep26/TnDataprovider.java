package Sep26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TnDataprovider {
 
	WebDriver driver;
	
	@BeforeMethod
		public void openbrowser() {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demosite.center/wordpress/wp-login.php");
	}
	
	@Test(priority=1)
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println("The title of the page is : "+title);
	}
	
	@Test(priority=2, dataProvider = "FBLogin")
	public void Login(String username, String password) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
		System.out.println("User able to enter username & password");
	}
	
	@Test( priority=3)
	public void ClickonLogin() {
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		System.out.println("User able to Log in");
	} 
	 
	@DataProvider(name="FBLogin")
	public Object[][] passData(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "test1@gal.com";
		
		data[0][1] = "aaaaa";
	
		data[1][0] = "sssss2@gmail.com";
	
		data[1][1] = "bbbbb";
		
		data[2][0] = "ppppp3@gmail.com";
		
		data[2][1] = "cccccc";
		
		return data;
		
	}

	@AfterMethod
	public void ClosingBrowser() {
		driver.quit();
	}
	}
