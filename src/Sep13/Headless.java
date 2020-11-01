package Sep13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
	
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.com/"); 
		System.out.println("The title of the page is : "+driver.getTitle());
	}

}
