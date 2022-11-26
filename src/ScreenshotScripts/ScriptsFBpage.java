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

public class ScriptsFBpage {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver  qw=new ChromeDriver();
	
	qw.get("https://www.facebook.com/");
	
	qw.manage().window().maximize();
	Thread.sleep(3000);
for(int i=0;i<=2;i++)	{
  File  as= ((TakesScreenshot)qw).getScreenshotAs(OutputType.FILE);
            // Scipt for Screenshot
  
  String df= RandomString.make(4);  //give different name for every screenshot
   
  File loction=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//AK"+df+".jpg");
	         // Storage Location path provided
  
  FileHandler.copy(as, loction);} // location path change by variable changes
	
qw.findElement(By.xpath("(//a[@role='button'])[2]")).click();
     
File we=((TakesScreenshot)qw).getScreenshotAs(OutputType.FILE);
File loction=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script.jpg");
  FileHandler.copy(we, loction);  
	}

}
