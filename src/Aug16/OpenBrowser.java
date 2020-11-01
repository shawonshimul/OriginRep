package Aug16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com" );
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Alfa");
		driver.findElement(By.name("reg_email__")).sendKeys("wrong@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("wrong@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc123abc");
		

		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByIndex(5);
		

		Select dropdown2 = new Select(driver.findElement(By.id("day")));
		dropdown2.selectByIndex(10);

		Select dropdown3 = new Select(driver.findElement(By.id("year")));
		dropdown3.selectByVisibleText("1985");

		Thread.sleep(3000);
		driver.findElement(By.id("u_1_5")).click();
		
		
		//driver.findElement(By.name("websubmit")).click();
		
		
}

}
