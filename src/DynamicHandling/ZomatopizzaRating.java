package DynamicHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatopizzaRating {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://www.zomato.com/pune/restaurants?place_name=Budhwar+Peth&dishv2_id=68987");
	 
	String Rating = driver.findElement(By.xpath("((//div[@class=\"sc-TuwoP QtGfa\"])[2]//div)[4]")).getText();
	
	System.out.println(Rating); 
}

}
