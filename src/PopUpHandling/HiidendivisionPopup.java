package PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiidendivisionPopup {
	
public static void main(String[] args) throws InterruptedException {
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
    WebDriver drive=new ChromeDriver();
    
    drive.get("https://www.flipkart.com/");
    Thread.sleep(2000);
    
   //  drive.findElement(By.xpath("//a[text()='Login']")).click();
     
   //  drive.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     
  drive.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8087971179");
	}
	

}
