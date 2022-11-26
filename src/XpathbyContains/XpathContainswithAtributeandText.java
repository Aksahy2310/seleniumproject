package XpathbyContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainswithAtributeandText {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver rt=new ChromeDriver();

	rt.get("https://www.amazon.in/");

	Thread.sleep(3000);
	
	rt.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("precise Carrom Stand");
	
	rt.navigate().forward();//a[contains(text(),'Cus')]
	rt.navigate().refresh();
	Thread.sleep(3000);
	
	rt.findElement(By.xpath("//a[contains(text(),'Cus')]")).click();
	
	
	////input[contains(@id,'twotab')]
		
	}

}
