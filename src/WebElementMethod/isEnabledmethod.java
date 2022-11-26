package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledmethod {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver sd=new ChromeDriver();
	
	sd.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	
	boolean output=sd.findElement(By.xpath("(//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]")).isEnabled();
	
	System.out.println(output);
	      // by using web element isenable method
// we simply just check the fuctionality is enable or disable on broser
	// in boolean format
}
}


