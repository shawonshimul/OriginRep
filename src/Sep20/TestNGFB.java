package Sep20;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFB {

	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void getPageTitle() {
		String title = driver.getTitle();
		System.out.println("The title of the page is : "+title);
	}
	
	@Test(priority=2)
	public void Login() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jajfj");
		System.out.println("User able to enter username & password");
	}
	
	@Test(priority=3)
	public void ClickonLogin() {
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		System.out.println("User able to Log in");
	}
	
	@AfterTest
	public void ClosingBrowser() {
		driver.quit();
	}
	
	
}
