package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtubeXpathAtribute {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
       WebDriver zx=new ChromeDriver();
       
       zx.get("https://www.youtube.com/");
       
       Thread.sleep(4000);
       
       zx.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Brahamhastra Trailer");
       
       Thread.sleep(3000);
       
     // zx.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).sendKeys("vande matram"); 
	}

}
