package XpathbyAtributeandText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaXpathText {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
WebDriver nm=new ChromeDriver();

nm.get("https://www.instagram.com/");

Thread.sleep(3000);

nm.findElement(By.xpath("//span[text()='Sign up']")).click();

Thread.sleep(3000);
nm.navigate().refresh();
nm.navigate().back();
Thread.sleep(3000);
nm.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
Thread.sleep(3000);
		
	}

}
