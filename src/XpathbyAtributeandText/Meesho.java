package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver nm=new ChromeDriver();

	nm.get("https://www.meesho.com/");

	Thread.sleep(3000);
	
	nm.findElement(By.xpath("//input[@color='greyBase']")).sendKeys("Titan Watch");
	
	Thread.sleep(3000);
	
	nm.navigate().refresh();
	
	nm.findElement(By.xpath("//span[text()='Women Ethnic']	")).click();
	
	
	////span[text()='Women Ethnic']	
	}

}
