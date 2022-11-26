package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedmethod {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver sd=new ChromeDriver();
		
		sd.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
//sd.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-topbar-logo-renderer'")).isDisplayed();

//boolean otput=sd.findElement(By.xpath("(//div[@class='style-scope ytd-topbar-logo-renderer'])[1]")).isDisplayed();

sd.findElement(By.xpath("(//div[@class='style-scope ytd-topbar-logo-renderer'])[1]")).click(); 

//System.out.println(otput);

}
}