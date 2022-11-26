package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpathText {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver cv=new ChromeDriver();
	
	cv.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	cv.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
//using text find locators formula= //tag name[text[]='text value']
	
	Thread.sleep(3000);
	cv.navigate().refresh();
		
	}

}
