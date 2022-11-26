package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
 WebDriver driver =new ChromeDriver();
 
 driver.get("https://www.youtube.com/");
 
 driver.manage().window().maximize();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//yt-formatted-string[text()='History']")).click();
 
 File er=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
 File zx=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//ABCD.jpg");
 
 FileHandler.copy(er, zx);
 
 driver.navigate().back();
	}

}
