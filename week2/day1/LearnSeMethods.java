package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSeMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		//The return type of findElement is WebElement
		//The return type of getText() is String
		WebElement text = driver.findElement(By.name("j_idt88:j_idt91"));
		System.out.println(text.getAttribute("value"));
		//To clear the existing text
		text.clear();
		
	}

}
