package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoXpathAtribute {
	
public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
			 WebDriver ad=new ChromeDriver();
			 
			 ad.get("https://www.zomato.com/");
			 
            Thread.sleep(4000);
	ad.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("Ganesh nagar wagholi");
	
//	ad.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"))ad.c
	

	
	
}

}
