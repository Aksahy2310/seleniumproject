package ScreenshotScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//import com.sun.tools.javac.launcher.Main;

import net.bytebuddy.utility.RandomString;

public class Mutiplescreenshot {
	WebDriver driver;
  public void AB() throws IOException {
	  File er=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String qw= RandomString.make(2);
	  File zx=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//ABCD"+qw+".jpg");
	  FileHandler.copy(er, zx); 
	  }
  
 
  
 
public static void main(String[] args) throws IOException {
	
	 Mutiplescreenshot fg=new Mutiplescreenshot();
	 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 driver.manage().window().maximize();
	 fg.AB();
	 
	 driver.findElement(By.xpath("//yt-formatted-string[text()='History']")).click();
	 fg.AB();
	 
	 driver.navigate().back();
	 fg.AB();
	 
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("vande matram");
	 fg.AB();
	 
	
}
}
