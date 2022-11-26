package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotInsta {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver as=new ChromeDriver();
	
	as.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	
	as.manage().window().maximize();
	
	Thread.sleep(2000);
	as.findElement(By.xpath("//span[@class='KPnG0']")).click();
	
	File xc=((TakesScreenshot)as).getScreenshotAs(OutputType.FILE);
	
	File df=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//ab.jpg");
	
	FileHandler.copy(xc, df);
	Thread.sleep(3000);
	
	as.navigate().back();
	
	
		
	}

}
