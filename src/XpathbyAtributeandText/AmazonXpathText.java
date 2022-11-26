package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpathText {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver cv=new ChromeDriver();
	
	cv.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
	cv.findElement(By.xpath("//span[text()='0']")).click();
	Thread.sleep(3000);
	cv.navigate().back();
	Thread.sleep(3000);
	cv.findElement(By.xpath("//span[text()='Returns']")).click();
	////span[text()='All']
		
	}

}
