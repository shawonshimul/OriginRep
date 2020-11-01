package HomeWork;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MorgCalc {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		
		//Home Value
		driver.findElement(By.id("homeval")).sendKeys("555555");
		
		//DownPayment
		driver.findElement(By.id("downpayment")).sendKeys("44444");
		
		//Loan Amount
		driver.findElement(By.id("loanamt")).sendKeys("511111");
		
		//interest rate
		driver.findElement(By.id("intrstsrate")).sendKeys("4.44");
		
		//Loan Term		
		driver.findElement(By.id("loanterm")).sendKeys("19");
		
		//Select month
		Select month = new Select(driver.findElement(By.name("param[start_month]")));
		month.selectByValue("11");
		
		//Property tax
		driver.findElement(By.id("pptytax")).sendKeys("1111");
		
		//PMI
		driver.findElement(By.id("pmi")).sendKeys("1");
		
		//Home Ins
		driver.findElement(By.id("hoi")).sendKeys("1111");
	
		// loan type
		Select type = new Select(driver.findElement(By.name("param[milserve]")));
		type.selectByIndex(1);
		
		//Buy or Refi
		Select buy = new Select(driver.findElement(By.name("param[refiorbuy]")));
		buy.selectByVisibleText("Buy");
		
		//Rating
		Select rating = new Select(driver.findElement(By.name("param[credit_rating]")));
		rating.selectByIndex(2);;
			
		driver.findElement(By.xpath("//input[@name='cal']")).click();
		
		File srcshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcshot, new File("C:\\Users\\shawon\\Desktop\\Test Data\\Test_Screenshot\\pic.jpg"));
	}

}
