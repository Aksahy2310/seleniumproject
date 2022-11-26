package testNGmultibrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testingfirefox {
	WebDriver driver;
	@Parameters("browsername")
	@Test
	public void m1(String browsername) {
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
			 driver = new ChromeDriver();
			
}else if (browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\geckodriver firefox\\geckodriver.exe");
		    driver = new FirefoxDriver();
		//	driver.get("www.fb.com");
}
	driver.get("www.fb.com");	
	}
	
	

}
