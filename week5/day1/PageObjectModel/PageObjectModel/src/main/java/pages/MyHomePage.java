package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.linktext.Leads"))).click();
		return new LeadsPage(driver);
	}

	
	


	
	public void clickAccount() {
		
	}
}
