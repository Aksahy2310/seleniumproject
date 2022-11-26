package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaXpathAtribute {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	 WebDriver as=new ChromeDriver();  // create object of chromedriver
     as.get("https://www.instagram.com");  // get method call for URL
     Thread.sleep(4000);                 // timmer adding  4 seconds
 
     as.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("8459074945");;
     // copy the path of the particular URL & using send keys values u have to pass parameter
   as.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("akshay123");;
 
	}

}
