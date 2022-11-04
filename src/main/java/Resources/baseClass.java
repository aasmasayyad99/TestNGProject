package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {
		//to read the data
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		//to access the data.properties file-
		prop=new Properties();
		//loading the read file 
		prop.load(fis);
		
		String browerName=prop.getProperty("browser");
		if (browerName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browerName.equalsIgnoreCase("firefox")) {
			//firefox code
		}
		else if(browerName.equalsIgnoreCase("edge")) {
			//edge code
		}
		else {
			System.out.println("please enter proper brower value");
		}
		
		}
	@BeforeMethod
	public void launchURL() throws IOException{
		initializeDriver();
		String url=prop.getProperty("url");
		driver.get(url);
	
	}
	


}
