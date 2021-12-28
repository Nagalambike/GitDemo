package Momentum;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
				driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
				driver.findElement(By.cssSelector(".blinkingText")).click();
				driver.manage().window().maximize();
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> it=windows.iterator();
				String parentid=it.next();
				String childid=it.next();
				driver.switchTo().window(childid);
				System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	}
}
