package Aug30;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
	
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count = 0;
		for(int i=0;i<links.size();i++) {
			if (links.get(i).isDisplayed()) {
				count++;
				
			}
		}
	System.out.println(count);
	System.out.println(links.size()-count);
	}

}
