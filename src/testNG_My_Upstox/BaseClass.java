package testNG_My_Upstox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	public void baseclas () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		
		
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
	}

}
