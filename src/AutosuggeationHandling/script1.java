package AutosuggeationHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("virat kohli");
	Thread.sleep(2000);
	List<WebElement> lists = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	
	int siz = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li")).size();
	
	System.out.println(siz);
	Thread.sleep(2000);
	lists.get(siz-2).click();
	
		
	}

}
