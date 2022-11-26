package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScriptinstaPage {
	
private static final String TakesScreenshot = null;

public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
WebDriver qw=new ChromeDriver();
qw.get("https://www.instagram.com/");
Thread.sleep(3000);
qw.manage().window().maximize();
qw.findElement(By.xpath("//span[@class='KPnG0']")).click();

File we=((TakesScreenshot)qw).getScreenshotAs(OutputType.FILE);
       // Scipt for take screenshot

String xy=RandomString.make(5);

File zx=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//DF"+xy+".jpg");

FileHandler.copy(we, zx);





	
	}

}
