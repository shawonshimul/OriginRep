import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=contact");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"fileUpload\"]")).sendKeys("");
	
	}

}

