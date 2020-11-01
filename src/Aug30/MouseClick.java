package Aug30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions mouse = new Actions(driver);
	
		WebElement Event = driver.findElement(By.name("login"));
		mouse.doubleClick(Event).build().perform();
		
	}

}
