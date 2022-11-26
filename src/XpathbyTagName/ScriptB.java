package XpathbyTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptB {

public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver nm=new ChromeDriver();

		nm.get("https://www.facebook.com/");

		Thread.sleep(3000);
		
	//	nm.findElement(By.linkText("Help")).click();    // using link text method
		
	
		
		
}
}