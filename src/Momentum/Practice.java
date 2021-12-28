package Momentum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); 
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Actions a=new Actions(driver);
		//driver.findElement(By.id("menu_time_viewTimeModule")).click();	
	driver.findElement(By.id("menu_time_viewTimeModule")).click();
		driver.findElement(By.xpath("//a[@id='viewSubmitted'][1]")).click();
	}
}

