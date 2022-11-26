package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Multiscreensot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
	     getscreenshot(driver, "page 1 Screenshot");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//yt-formatted-string[text()='History']")).click();
		 getscreenshot(driver, "page 2 Screensho");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("vande matram");
		 getscreenshot(driver, "page 3 Screensho");
	}
	 public static void getscreenshot(WebDriver driver,String name) throws IOException
	  {
		  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File destination= new File("C:\\Users\\Admin\\Desktop\\Screenshot Script\\"+name+".jpg");
		  FileHandler.copy(source, destination);
	  }

}
