package Momentum;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.FluentIterable;



public class Practice1 {

	public static void main(String[]args, int FluentWait) throws InterruptedException
	{
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\driverrrrr\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

	driver.findElement(By.id("start")).click();
	}
}
	///fluent wait(class) implements wait interface
	
//////implicit wait////////////////////////////////////////////
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//	  int j=0;               //to see hpw many times it goes to loop for prod
//
////declare as array to reduce space not in arraylist which takes morespace
//	    String[]itemsneeded= {"Brocolli","Cauliflower"};//declare array to search for only these product in list
//	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//	    Thread.sleep(3000);
//	    additems(driver,itemsneeded);
//	   driver.findElement(By.xpath("//img[@alt='Cart']")).click();
//	   driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//	   
//	//explicit wait//////////////////////
//	   WebDriverWait wait=new WebDriverWait(driver, 5);
//	   wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promoCode"))));//for  displaying text in box
//
//	   driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");	 
//	   driver.findElement(By.cssSelector("button.promoBtn")).click();
//	  
//		}
//		public static void additems(WebDriver driver, String[]itemsneeded)
//		
//		{
//		
/////////////use cssselector for class to find all products in product list
//		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
//		
//	////////Iterate through products
//		for(int i=0;i<products.size();i++)
//		{
//			//Broccoli,   1kg split
//		
//		String[] prodname=products.get(i).getText().split("-");
//		String formattedname=prodname[0].trim();
//		 //pass which product u want ,it contineuos untill all products r counted and get textof productString 
//	// format it to get actual vegetable name (Cucumber instead of Cucumber-1 kg)
//		 
//		 
//	//Check whether name you extracted is present in arraylistn or not
//	//convert array to arraylist  for easy searching of products
//		
//		  List itemslist=Arrays.asList(itemsneeded);
//		 
//			if(itemslist.contains(formattedname))
//			{
//			
//				//apply click on add to cart
//				
//				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
//				           //to come out of loop once we find product 
//			}
//			
//			
//		}
//		
//}
//}