package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test
	public void createLead() {
		System.out.println("Leads are created successfully");
		throw new RuntimeException();
	}
	
	@Test()
	public void editLead() {
		System.out.println("Leads are updated successfully");
		throw new RuntimeException();
	}
	
	
	@Test(dependsOnMethods= {"createLead"},alwaysRun=true)
	public void deleteLead() {
		System.out.println("Leads are deleted successfully");
	}
	
	@Test(invocationCount=3)
	public void duplicateLead() {
		System.out.println("Leads are duplicated successfully");
	}

}
