package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class script1 {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
		
 WebDriver driver = new ChromeDriver();

 driver.get("https://www.meesho.com/");
 Thread.sleep(2000);

 File files = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
 Thread.sleep(2000);
 
  File Fil = new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//akzz.jpg");
  
  FileHandler.copy(files, Fil);
  

	}
}