package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptA {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	
	WebElement path = driver.findElement(By.xpath("(//a[text()='Videos'])[1]"));
	Thread.sleep(2000);
	act.moveToElement(path).contextClick().build().perform();
	
	
	}

}
