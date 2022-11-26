package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxmyaccount {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://groww.in/");
	
	driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Sign in as V2july008 akshay']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.xpath("Thread.sleep(2000);")).sendKeys("220029");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()='Continue']")).click();
//	
	
	
	
	}

}
