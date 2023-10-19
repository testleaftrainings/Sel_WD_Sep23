package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearndragNdrop {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		
		//Hovering 
		Actions build=new Actions(driver);
		build.moveToElement(men).perform();
		
		
		driver.navigate().to("https://www.leafground.com/menu.xhtml");
		//driver.navigate().back();
		WebElement customer = driver.findElement(By.xpath("//span[text()='Customers']"));
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		
		build.contextClick(customer).perform();
		build.click(save).perform();
		
		
	}

}
