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

public class ScriptMeeshoapp {
	
public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
		WebDriver qw=new ChromeDriver();
		qw.get("https://www.meesho.com/");
		Thread.sleep(3000);
		qw.manage().window().maximize();
		
		File df=((TakesScreenshot)qw).getScreenshotAs(OutputType.FILE);
		
		String ty=RandomString.make(3);
		
		File fg=new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//aks"+ty+".jpg");
		
		FileHandler.copy(df, fg);
		
		
		
		
		
		
	}

}
