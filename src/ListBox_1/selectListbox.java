package ListBox_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectListbox {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver as=new ChromeDriver();
	
	as.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	as.manage().window().maximize();
	
	Thread.sleep(2000);
	
	as.findElement(By.xpath("//a[@rel='async']")).click();
	
	Thread.sleep(2000);
	
  WebElement zx=	as.findElement(By.xpath("//select[@title='Day']"));

 Select cv=new Select(zx);
  
  //     cv.selectByValue("23");         // selectbyStringvalue method
       cv.selectByIndex(1);             //  selectbyindexmethod
   //      cv.selectByVisibleText("12");	  
        
  List<WebElement> qw=  cv.getOptions();
  String  we=qw.get(1).getText();
  System.out.println(we);
        
  
        
   
		
	}

}
