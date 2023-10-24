

package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeads extends ProjectSpecificMethod {

	
	
	@BeforeTest
	public void setFileName() {
		fileName="CreateLead";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runCreate(String cname,String fname,String lname,String phno) {
		
		new LoginPage(driver).enterUsername().enterPassword().clickLogin().clickCrmSFA().clickLeads()
		.clickcreateLeads().enterComapanyName(cname).enterFirstName(fname).enterlastName(lname)
		.enterPhno(phno).clickSubmit().verifyCreteLead();
		
	}
}
