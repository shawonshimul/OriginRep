package Aug29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {

	public static void main(String[] args) {
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement>imagesi = driver.findElements(By.tagName("img"));
		System.out.println(imagesi.size());
		for (int i=0;i<imagesi.size();i++) {
		System.out.println(imagesi.get(i).getAttribute("src"));
		}
	
	
	}

}
