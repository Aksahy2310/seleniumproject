package ActionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		  
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
		  
		WebElement sorce=driver.findElement(By.xpath("(//a[@class=\'button button-orange\'])[2]"));
		
		WebElement dest=driver.findElement(By.xpath("(//li[@class=\'placeholder\'])[4]"));
		
		Actions act =new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(sorce, dest).perform();
		
	//	act.moveToElement(sorce).clickAndHold().moveToElement(dest).release().perform();
		
		
		
	//  https://demo.guru99.com/test/simple_context_menu.html    double click link	
}
}