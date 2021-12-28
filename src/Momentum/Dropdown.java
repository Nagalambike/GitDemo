package Momentum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//select dropdown with select tag
		
		//WebElement w=driver.findElement(By.id("first"));
		Select s=new Select(driver.findElement(By.id("select-demo")));//create object for select class
		s.selectByIndex(5);//by index select the option
		System.out.println(s.getFirstSelectedOption().getText());//get first selectwed option
		
	//s.selectByVisibleText("Monday");//select option by text writing
System.out.println(s.isMultiple());//retruns false if not multiple select option

	}

}
