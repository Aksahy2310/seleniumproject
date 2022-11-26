package XpathbyIndex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexMethod3withContains {
	
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver nm=new ChromeDriver();

		nm.get("https://www.meesho.com/");

		Thread.sleep(3000);
		
		nm.findElement(By.xpath("(//div[contains(@class,'NavBar')])[4]")).click();

}}
//  //div[contains(@class,'NavBar')]