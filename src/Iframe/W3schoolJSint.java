package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolJSint {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
	 driver.switchTo().frame("iframeResult");
	 
	  driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	 
	 driver.switchTo().parentFrame();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//a[@id=\"menuButton\"]")).click();
	 Thread.sleep(2000);

	 driver.navigate().refresh();
	// driver.switchTo().parentFrame();
	 driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	}

}
