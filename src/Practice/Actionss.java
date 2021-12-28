//Action class is useful mainly for mouse and keyboard actions. In order to perform such actions, Selenium provides various methods.
//
// Mouse Actions in Selenium:
//
//doubleClick(): Performs double click on the element
//clickAndHold(): Performs long click on the mouse without releasing it
//dragAndDrop(): Drags the element from one point and drops to another
//moveToElement(): Shifts the mouse pointer to the center of the element
//contextClick(): Performs right-click on the mouse

//Keyboard Actions in Selenium:
//sendKeys(): Sends a series of keys to the element
//keyUp(): Performs key release
//keyDown(): Performs keypress without release


package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.browserstack.com/");
		Actions a=new Actions(driver);
		WebElement element = driver.findElement(By.id("signupModalButton"));
				a.moveToElement(element).build().perform();
//////	/////doubleclick
				
				
		
		
		
	}

}
