package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificMethod {

	
	public ChromeDriver driver;
	public String fileName;
	public static Properties prop;

	
	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String language) throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/"+language+".properties");		
		prop = new Properties();
		prop.load(fis);

		driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	@DataProvider(name = "fetchData", indices = { 0 }) // to choose the rows to be executed
	public String[][] sendData() throws IOException {
		String[][] data = ReadExcel.readData(fileName);
		return data;
	}

}
