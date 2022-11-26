package XpathbyContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsbyText {
	
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver sd=new ChromeDriver();

	sd.get("https://www.instagram.com/");

	Thread.sleep(3000);
	
	sd.navigate().refresh();
	
	sd.findElement(By.xpath("//span[contains(text(),'Facebook')]")).click();
	
	// formula for find element by contains text 
	//  formula=    //tag name[contains(text(),'text value')]
	}

}
