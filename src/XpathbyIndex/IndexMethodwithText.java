package XpathbyIndex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexMethodwithText {
	
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver nm=new ChromeDriver();

		nm.get("https://www.facebook.com/");

		Thread.sleep(3000);
		
		nm.findElement(By.xpath("(//a[@role='button'])[2]")).click();

}}
