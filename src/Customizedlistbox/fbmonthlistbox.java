package Customizedlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbmonthlistbox {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	
	WebElement loction = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Thread.sleep(2000);
	
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	act.click(loction).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.HOME).perform();

	
    for(int i=0;i<=11;i++) {
    	
    act.sendKeys(Keys.ARROW_DOWN).perform();
    	Thread.sleep(2000);
    	}
    
    act.sendKeys(Keys.ENTER).perform();
	}

}
