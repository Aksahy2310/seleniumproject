package ListBox_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAllmethod {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
      WebDriver qw=new ChromeDriver();
      qw.get("https://www.facebook.com/");
      qw.findElement(By.xpath("//a[@rel='async']")).click();
      Thread.sleep(2000);
      
	WebElement as=qw.findElement(By.xpath("//select[@id='month']"));
		
    Select zx=new Select(as);
		
 	zx.selectByIndex(9);     //  select the element by index
 //	zx.selectByValue("10");  //  select the element by puting String value
 // zx.selectByVisibleText("Oct");	// select the element by Text

    Thread.sleep(3000);
    
    boolean sd= zx.isMultiple();
    System.out.println(sd);
  
    
		
		
	}

}
