package com.peddleup.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	// Initialize the WebDriver using static variable.
	public static WebDriver driver;
	public static Properties prop;
	
	// Creating the constructor of TestBase class.
	public TestBase() {
		// Read the properties inside the config.properties file 
				try {
					prop = new Properties();
					FileInputStream ip = new FileInputStream("D:/PeddleUp Project/PageObjectModel/src/main/java/com/pom/qa/config/config.properties");
					prop.load(ip);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
	
	public static void initialization() {
		// First read the properties of browser.
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:/Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("msedge")) {
			System.setProperty("webdriver.edge.driver", "E:/Driver/chromedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		// Initialize the properties at global level
		driver.get(prop.getProperty("url"));
		
	}

}
	
