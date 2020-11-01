
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBNavigate {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("babu.shawon.gh@gmail.com");;
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	
	
		
	}

	
}
