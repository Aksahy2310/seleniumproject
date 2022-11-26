package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']"));
	Thread.sleep(2000);
	
    act.dragAndDrop(source, dest).perform();
		
	}

}
