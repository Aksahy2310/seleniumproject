package Customizedlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import WebElementMethod.SendKeysmethod;

public class fbpagelistbox {
	
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	
	WebDriver gh=new ChromeDriver();

	gh.get("https://www.facebook.com/");

	gh.manage().window().maximize();
	gh.findElement(By.xpath("(//a[@role='button'])[2]")).click();

	Thread.sleep(2000);

	 WebElement ab1= gh.findElement(By.xpath("//select[@id='day']"));
	 Thread.sleep(2000);
	 Actions act=new Actions(gh);
	 
	 act.click(ab1).perform();
	 Thread.sleep(2000);
	 act.sendKeys(Keys.ARROW_UP).perform();
	 Thread.sleep(2000);
	 act.sendKeys(Keys.ENTER).perform();
	 
	 act.sendKeys(Keys.HOME).perform();
	 
	 for(int i=0;i<=7;i++) {
		 
		 act.sendKeys(Keys.ARROW_DOWN).perform();
		 Thread.sleep(2000);
		}
		 act.sendKeys(Keys.ENTER).perform();
	 
	 
	 
	 
	 
	}

}
