package Aug30;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/reg/");
		
		WebElement fn = driver.findElement(By.name("firstname"));
		WebElement ln = driver.findElement(By.name("lastname"));
		
		sendkeys(driver, fn, 20, "java");
		sendkeys(driver, ln, 20, "selenium");
		
	}

	public static void sendkeys(WebDriver driver, WebElement locator, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
	}
}
