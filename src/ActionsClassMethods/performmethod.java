package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class performmethod {

public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.meesho.com/");
	  
	 WebElement dest = driver.findElement(By.xpath("//span[text()='Kids']"));
	 
	 Actions act=new Actions(driver);
	 
	 act.moveToElement(dest).perform();
	  
	  

	}

}
