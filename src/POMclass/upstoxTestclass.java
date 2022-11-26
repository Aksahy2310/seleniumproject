package POMclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxTestclass {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login-v2.upstox.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
		
	upstoxpage1 obj1 = new upstoxpage1(driver);
	
	obj1.userid();
	obj1.password();
	obj1.signclick();
	Thread.sleep(2000);
	
	upstoxpage2 obj2 = new upstoxpage2(driver);
	obj2.OTP();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
    upstoxpage3 obj3 = new  upstoxpage3(driver);
	obj3.welcome();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	upstoxpage4 obj4 = new  upstoxpage4 (driver);
	 obj4.Accholdername();
	}

}
