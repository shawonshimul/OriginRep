package Aug30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsWork {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
	
		Thread.sleep(4000);
		
		//Getting input tag and store in list variable name "numberOfElements"
		List<WebElement>numberOfElements=driver.findElements(By.tagName("input"));
		
		//Print total number of hidden element
		System.out.println(numberOfElements.size());
		
		for( int i=0;i<numberOfElements.size();i++) {
			
			//Print all input tag
			if(numberOfElements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) {
				
				//check for empty text
				if(!(numberOfElements.get(i).getAttribute("value").trim().isEmpty())) {
					
					//print all hidden element text
					//trim = allows you to ignore or empty space
					System.out.println("Hidden Element Text = "+i + " "+numberOfElements.get(i).getAttribute("value").trim());
				}
			}
						
		}
	
	}

}
