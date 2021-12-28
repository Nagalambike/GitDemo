package Momentum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipledropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/nagalambikeb/eclipse-workspace/Automation/driverrrrr/chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.findElement(By.id("multi-select"));
		

	}

}
