package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\ChromeDriver\\\\chromedriver107.exe");

    WebDriver driver = new ChromeDriver();
	  
    driver.get("https://www.meesho.com/");
	  
	WebElement dest=driver.findElement(By.xpath("//span[text()='Electronics']"));
	
	Actions act =new Actions(driver);    //   action on browser so create class Actions
	
	act.contextClick(dest).perform();   // right click on that element
	
	
		
	}

}
