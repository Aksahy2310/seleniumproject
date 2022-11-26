package XpathbyContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsAtribute {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver az=new ChromeDriver();

	az.get("https://www.instagram.com/");

	Thread.sleep(3000);
	
	az.findElement(By.xpath("//input[contains(@aria-label,'Phone')]")).sendKeys("8459074945");
	
	// formula for find elements using contains atribute 
  //     formula=  //tagname[contains(@ atribute name,'atribute value')]
		
	}

}
