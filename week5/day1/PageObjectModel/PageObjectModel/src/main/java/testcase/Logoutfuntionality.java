package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class Logoutfuntionality extends ProjectSpecificMethod {

	@Test
	public void runLogout() {
		
		new LoginPage(driver).enterUsername().enterPassword().clickLogin().clickLogout();
		
	}
	
}
