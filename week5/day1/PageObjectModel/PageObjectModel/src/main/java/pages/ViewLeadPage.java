package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewLeadPage verifyCreteLead() {
		System.out.println(driver.getTitle());
		return new ViewLeadPage(driver);
	}

}
