package com.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
public static WebDriver driver;
public static Properties prop;

public  Testbase() {
	prop=new Properties();
	FileInputStream fis;
	try {
		fis = new FileInputStream("./src/main/java/com/config/config.properties");
		prop.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//to access config.prperty file
 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	public static  void initialisation()
	{
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))	
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
public void teardown()
{
	driver.close();
}


	
}

