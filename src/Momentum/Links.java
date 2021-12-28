package Momentum;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class Links {


    	public static void main(String[] args) throws InterruptedException {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagalambikeb\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
    		ChromeDriver  driver=new ChromeDriver();
    		Thread.sleep(2000);
    		driver.get("https://www.amazon.in");
    		
        List<WebElement> x = driver.findElements(By.tagName("a"));
        // System.out.println(x);
        for (WebElement webElement : x) {
            System.out.println(webElement);
        }    System.out.println(x.size());

 

    List<String> urlList=new ArrayList<String>();
        for (WebElement e : x) {
            String url = e.getAttribute("href");
            urlList.add(url);

        }
        long stTime=System.currentTimeMillis();
        urlList.stream().forEach(e->{
            try {
                checkBrokenLink(e);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        long endTime=System.currentTimeMillis();
        System.out.println("the total time "+(endTime-stTime));//p->49300,normal->303493
driver.close();

 

        
    }
public static void checkBrokenLink(String linkurl) throws IOException {
        
        try {
            URL url=new URL(linkurl);
            HttpURLConnection httpurlconnection=(HttpURLConnection) url.openConnection();
        httpurlconnection.setConnectTimeout(5000);
        httpurlconnection.connect();
        if(httpurlconnection.getResponseCode()>=400) {
            System.out.println(linkurl+"---->"+httpurlconnection.getResponseMessage()+" is a broken link");
        }else {
            System.out.println(linkurl+"---->"+httpurlconnection.getResponseMessage());
        }
        
        } catch (MalformedURLException e)
        {
  
            e.printStackTrace();
        }

        
}
}
