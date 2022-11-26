package ScreenshotScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 {
	
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mysql.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File f= new File("C:\\Users\\Admin\\Desktop\\Screenshot Script//ak47.jpg");
	
	FileHandler.copy(sc, f);
	
	}

}
