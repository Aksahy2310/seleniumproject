package AutosuggeationHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchautohandle {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");

driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mumbai");
//Thread.sleep(2000);
List<WebElement>  allsize = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));

int count = allsize.size();
System.out.println(count);

//Thread.sleep(3000);

allsize.get(count-3).click();






	}

}
