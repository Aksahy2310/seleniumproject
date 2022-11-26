package testNG_With_PropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	WebDriver driver;
	
	public void baseclass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://login-v2.upstox.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String url=utilityClass.getdatafrompropertyfile("URL");
		//driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	

}
