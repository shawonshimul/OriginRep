package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomPrac {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email_create")).sendKeys("arif.shawon.gh2@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		

	}

}
