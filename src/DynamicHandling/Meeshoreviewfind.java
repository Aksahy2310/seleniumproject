package DynamicHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meeshoreviewfind {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://www.meesho.com/men-watches/pl/3k7");
	
	 String rview1= driver.findElement(By.xpath("((//div[@class=\"sc-dkPtyc ProductList__GridCol-sc-8lnc8o-0 dqIYJu ilkWHh\"])[1]//span)[5]")).getText();
	 
	 System.out.println(rview1);
	 
	String rview2= driver.findElement(By.xpath("((//div[@class=\"sc-dkPtyc ProductList__GridCol-sc-8lnc8o-0 dqIYJu ilkWHh\"])[2]//span)[6]")).getText();
	
     System.out.println(rview2);
	
     String rview3= driver.findElement(By.xpath("((//div[@class=\"sc-dkPtyc ProductList__GridCol-sc-8lnc8o-0 dqIYJu ilkWHh\"])[3]//span)[6]")).getText();
	
     System.out.println(rview3);
	}

}
