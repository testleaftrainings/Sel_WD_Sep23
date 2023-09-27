package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchBrowser {

	public static void main(String[] args) {
		
		/*
		 * Selenium dependency - below 4.6.0 - WebDriverManager
		 * 
		 * Selenium dependency - above 4.6.0 - SeleniumManager
		 * 
		 * versions that we use - above 4.10.0 - 4.11, 4.12, 4.13
		 * 
		 */
		
	//Initialize the driver
		
		//ChromeDriver is a class - F3
		
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//get() - to load the url
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//To locate the web element - findElement
	
	//Enter the username - By is an abstract class
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	//Enter password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//Click Login
	driver.findElement(By.className("decorativeSubmit")).click();
		
	}

}
