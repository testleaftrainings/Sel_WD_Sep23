package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
	
		//Step:1 Set the path
		FileInputStream fis=new FileInputStream("./src/main/resources/Config.properties");
		
		//Step:2  Instantiate the class Properties
		Properties prop=new Properties();
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

		
		
		
		
		
	}

}
