package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnHoveraction {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Hovering 
		Actions build=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		int x = drag.getLocation().getX();
		build.dragAndDropBy(drag, x+50, 0).perform();
		
		WebElement rangeSlider = driver.findElement(By.xpath("//h4[text()='Range Slider']"));
		
		build.scrollToElement(rangeSlider).perform();
		String text = rangeSlider.getText();
		
		build.scrollByAmount(0, -400).perform();
		
	}

}
