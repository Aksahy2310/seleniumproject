package AutosuggeationHandling;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oyosearch {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.oyorooms.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.xpath("//input[@id='autoComplete__home']")).sendKeys("pune");
	
//	driver.switchTo().alert().dismiss();
	
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='oyo-row oyo-row--no-spacing geoSuggestionsList__container ']/div"));
	
    int size = driver.findElements(By.xpath("//div[@class='oyo-row oyo-row--no-spacing geoSuggestionsList__container ']/div")).size();
	
	System.out.println(size);
	
	Thread.sleep(3000);
	
	list.get(size-1).click();
//	Thread.sleep(2000);
	


	
	
	}

}
