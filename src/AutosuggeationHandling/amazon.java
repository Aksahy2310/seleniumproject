package AutosuggeationHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("mobile");
		
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		int size1 = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div")).size();
		
		System.out.println(size1);
		
		Thread.sleep(1000);
		
		list1.get(size1-4).click();
	}


}
