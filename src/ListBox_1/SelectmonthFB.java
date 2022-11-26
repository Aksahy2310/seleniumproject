package ListBox_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectmonthFB {
	
public static void main(String[] args) throws InterruptedException {
	
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver as=new ChromeDriver();
	
	as.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	as.manage().window().maximize();
	
	Thread.sleep(2000);
	as.findElement(By.xpath("//a[@rel='async']")).click();
	Thread.sleep(2000);
	
	WebElement qw=as.findElement(By.xpath("//select[@id='month']"));
	
	Select rt=new Select(qw);
	
	rt.selectByValue("10");
	
		
	}

}
