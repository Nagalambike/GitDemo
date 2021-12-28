package Momentum;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandleamzon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.xpath("//a[text()='Conditions of Use']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");//for scrolling use javascript
		driver.manage().window().maximize();//maximise window
		driver.findElement(By.xpath("//a[text()='Amazon.in/business']")).click();
		Set<String> windows=driver.getWindowHandles();//to handle windows
		Iterator<String> it=windows.iterator();
		String parentid=it.next();//parent window
		String childid=it.next();//child window
		driver.switchTo().window(childid);//switch to child window
		System.out.println(driver.getTitle());//get title of child window
		driver.switchTo().window(parentid);//switch to parent window
		System.out.println(driver.getTitle());
	}

}
