package Momentum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("nagu");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(3000);
		driver.switchTo().alert().accept();//switching to alert box and accept the alert  message
		
		driver.findElement(By.id("confirmbtn")).click();//to click on confirm button
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());//get text present in alert box
		driver.switchTo().alert().dismiss();//to cancel alert message
		
	
		
	}

}
