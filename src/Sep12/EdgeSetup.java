package Sep12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeSetup {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver", "C:\\QA SOFTWARE\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.com/");
	System.out.println(driver.getTitle());
	}

}
