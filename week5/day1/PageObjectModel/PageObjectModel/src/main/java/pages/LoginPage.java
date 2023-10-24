package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return new LoginPage(driver);
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		return new LoginPage(driver);

	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);

	}

}
