package ListBox_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultileselectHTML {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	WebDriver qw=new ChromeDriver();
	
  qw.get("file:///C:/Users/Admin/Desktop/month.html");
  Thread.sleep(3000);
  
 WebElement sd= qw.findElement(By.xpath("//select[@id='1256']"));
 Thread.sleep(3000);
 
 Select vb=new Select(sd);
 
vb.selectByIndex(0);
vb.selectByIndex(1);
vb.selectByIndex(2);
	
	Thread.sleep(3000);
	
	
		
	}

}
