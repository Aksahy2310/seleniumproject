package XpathbyIndex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexMethod1Atribute {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver nm=new ChromeDriver();

		nm.get("https://www.instagram.com/accounts/emailsignup/");

		Thread.sleep(3000);
		
		nm.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Akshay");
		
		Thread.sleep(3000);
		
		nm.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kanse");
		
		nm.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8045479852");
		
		
	}

}
