package Aug30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions drag = new Actions(driver);
		
		WebElement dropElement = driver.findElement(By.id("draggable"));
		WebElement dropsourceElement=driver.findElement(By.id("droppable"));
	
		drag.clickAndHold(dropElement).moveToElement(dropsourceElement).release().build().perform();
	}

}
