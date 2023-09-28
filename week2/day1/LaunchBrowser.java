package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



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
	
	//Get the text using tagName
	System.out.println(driver.findElement(By.tagName("h2")).getText());
	
//	String heading = driver.findElement(By.tagName("h2")).getText();
//	System.out.println(heading);
	
	//Click CRM/SFA
	
//	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.partialLinkText("CRM")).click();
	
		
	//To get the title of the page
	System.out.println(driver.getTitle());
	
	//Click Leads
	driver.findElement(By.linkText("Leads")).click();
	
	//Click Create Lead
	driver.findElement(By.linkText("Create Lead")).click();
	
	//Locate the dropdown WebElement
	
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	/*
	 * Create an object for the Select class
	 * Pass the WebElement as an argument inside Select constructor
	 * Select(WebElement)
	 */
	
	Select dd = new Select(source);
	
	//using the visible text
	
//	dd.selectByVisibleText("Direct Mail");
	
	//using the value attribute
	
//	dd.selectByValue("LEAD_DIRECTMAIL");
	
	//using index
	dd.selectByIndex(5);
	
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("7500000");
	
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	
	Select dd_ind = new Select(industry);
	
	dd_ind.selectByVisibleText("Computer Software");
	
	
	
	
	}

}
