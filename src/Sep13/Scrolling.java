package Sep13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sjcny.edu/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll by pixel
		
		//js.executeScript("window.scrollBy(0, 1000)", "");

		//visible element
		//WebElement kindle =driver.findElement(By.xpath("//button[@class='css-1qosac6']"));
		
		//there is 2 argument, first one is go to scroll view and 2nd is go to kindle locaton
		//js.executeScript("arguments[0].scrollIntoView();", kindle);
		
	
		//Going to the bottom of the page
		//only one argument which is going to bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
