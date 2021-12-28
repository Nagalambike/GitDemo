package Momentum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
				driver.get("https://www.amazon.in");
				driver.manage().window().maximize();
		
Actions a=new Actions(driver);
//move to particular element(moveto element) present on webpage and rightclick(contextclick)
a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();//build=ready to excute and perform=execute
//go to search field and type sandles (sendkeys)in capital letter(keydown) and then select ( dubleclick)
Thread.sleep(2000);
a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("sandles").doubleClick().build().perform();

	}
}