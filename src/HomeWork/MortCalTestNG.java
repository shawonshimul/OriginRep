package HomeWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MortCalTestNG {

	
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.mortgagecalculator.org/");
	}
	
	@Test (priority =1)
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("The title of the page is : "+title);
	}
	@Test(priority=2)
	public void BasicInfo() {
		
		driver.findElement(By.xpath("//input[@id='homeval']")).sendKeys("555555");
		driver.findElement(By.xpath("//input[@id='downpayment']")).sendKeys("44444");
		driver.findElement(By.xpath("//input[@id='loanamt']")).sendKeys("511111");
		driver.findElement(By.xpath("//input[@id='intrstsrate']")).sendKeys("4.44");
		driver.findElement(By.xpath("//input[@id='loanterm']")).sendKeys("19");
	}
	@Test (priority=3)
	public void SelectMonth() {
			Select month = new Select(driver.findElement(By.name("param[start_month]")));
			month.selectByValue("11");
	}
			
	@Test (priority=4)
	public void LoanDetails() {
			driver.findElement(By.xpath("//input[@id='pptytax']")).sendKeys("1111");
			driver.findElement(By.xpath("//input[@id='pmi']")).sendKeys("1");
			driver.findElement(By.xpath("//input[@id='hoi']")).sendKeys("1111");
	}
	
	@Test (priority=5)
	public void LoanType() {
			Select type = new Select(driver.findElement(By.name("param[milserve]")));
			type.selectByIndex(1);
			
			Select buy = new Select(driver.findElement(By.name("param[refiorbuy]")));
			buy.selectByVisibleText("Buy");
			
			Select rating = new Select(driver.findElement(By.name("param[credit_rating]")));
			rating.selectByIndex(2);;
	}
	
	@Test (priority=6)
	public void ClickButton() {
		
			driver.findElement(By.xpath("//input[@name='cal']")).click(); 
		
	}		
	@AfterTest
	public void ScreenShot() throws IOException {
		File srcshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcshot, new File("C:\\Users\\shawon\\Desktop\\Test Data\\Test_Screenshot\\pic.jpg"));
	
	}

}
