package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoublrClickmethod {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		  
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    
 WebElement Dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
 Actions act=new Actions(driver);
 
 act.doubleClick(Dclick).perform();
 Thread.sleep(3000);
 
  String txt=driver.switchTo().alert().getText();  //  Script for Alert pop text
  
  System.out.println(txt);

  driver.switchTo().alert().accept();
 
 
		  

}
}