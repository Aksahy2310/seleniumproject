package testNGparalleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxbrowseropens {
	@Test
  public void tc1() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\geckodriver firefox\\geckodriver.exe");
		
		WebDriver as=new FirefoxDriver();
		
		as.get("https://www.instagram.com/");
		
  }

}
