package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop; 
	public static WebEventListener w;
	
	
	public static void init() throws IOException {
		FileInputStream f = new FileInputStream("/Volumes/Macintosh HD - Data/Selenium/Selenium_Workspace/ProjectFrameWork/src/main/java/com/qa/util/config.properties");
		prop= new Properties();
		prop.load(f);
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/chromedriver 2");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.gecko.driver", "/Volumes/Macintosh HD - Data/Selenium/SeleniumJars/geckodriver");
			driver = new FirefoxDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	EventFiringWebDriver ew = new EventFiringWebDriver(driver);
	w = new WebEventListener();
	ew.register(w);
	driver = ew;

	
		
		
		
	}
		
		public static void tearDown() {
			driver.quit();
			
		}
		
	
		
	}


