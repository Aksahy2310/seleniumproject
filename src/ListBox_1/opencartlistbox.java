package ListBox_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class opencartlistbox {
	
public static void main(String[] args) throws InterruptedException {
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
  WebElement country = driver.findElement(By.xpath("//select[@id='input-country']"));
  
  Select selct = new Select(country);
  
 // selct.selectByIndex(99);
 // selct.selectByValue("99");
  selct.selectByVisibleText("India");
	
	
	
	
	
	
	
	
		
	}

}
