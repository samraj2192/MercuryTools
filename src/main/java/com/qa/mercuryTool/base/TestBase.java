package com.qa.mercuryTool.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream FIS = new FileInputStream("C:/Users/sabhowmi/workspace/MercuryTools/src/main/java/com/qa/mercuryTool"
								 	+"config/config.properties");
			prop.load(FIS);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")){
			System.setProperty("Webdriver.chrome.driver", "C:\\Samraj_backup\\Softwares\\Extracted jars\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
}
