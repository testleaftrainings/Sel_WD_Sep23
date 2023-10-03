package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafatpswithXPath {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 //locating username with xpath
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");

	}

}
