package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
     WebDriver xz=new ChromeDriver();
     
     xz.get("https://www.freecharge.in/");
     
     Thread.sleep(3000);
     
     xz.findElement(By.xpath("//img[@alt='Freecharge Mobile recharge']")).click();
     Thread.sleep(3000);
     
  //   xz.findElement(By.xpath("//input[@type='tel']")).sendKeys("8087971179");
  
	 WebElement cv=xz.findElement(By.xpath("//input[@type='tel']"));
	  cv.sendKeys("7898785265");
	  Thread.sleep(3000);
	  cv.clear();
	 
	  cv.sendKeys("9209695425");
	  Thread.sleep(3000);
	  cv.clear();
	 
	  cv.sendKeys("9860127143");
	  
	  
	  

	  
	  
	  
	  
}
}