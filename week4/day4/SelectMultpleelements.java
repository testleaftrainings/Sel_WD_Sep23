package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectMultpleelements {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		//Hovering 
		Actions build=new Actions(driver);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		build.keyDown(Keys.CONTROL).click(item1)
		 .click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		
		
	}

}
