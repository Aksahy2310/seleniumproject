package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotfile1 {

public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
	WebDriver qw=new ChromeDriver();
	qw.get("https://www.instagram.com/");
	Thread.sleep(3000);
	qw.manage().window().maximize();
	qw.findElement(By.xpath("//span[@class='KPnG0']")).click();

	
	File takeS=((TakesScreenshot)qw).getScreenshotAs(OutputType.FILE);
	
	File Dest=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//aksh.jpg");
	
	FileHandler.copy(takeS, Dest);

	}

}
