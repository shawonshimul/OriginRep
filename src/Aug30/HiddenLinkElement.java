package Aug30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenLinkElement {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com/");
	
		List<WebElement>links=driver.findElements(By.tagName("a"));
	}

}
