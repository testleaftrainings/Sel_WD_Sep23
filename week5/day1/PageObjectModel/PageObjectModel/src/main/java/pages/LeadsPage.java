package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod {

	
	
	
	public LeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLeadPage clickcreateLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.linktext.create"))).click();
		return new CreateLeadPage(driver);
	}

}
