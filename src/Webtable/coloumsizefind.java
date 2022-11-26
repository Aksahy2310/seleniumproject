package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coloumsizefind {
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/Admin/Desktop/webtable.html");
    
  int size = driver.findElements(By.xpath("(//table[@id='1234']//tr)[2]/td")).size();
    
		System.out.println(size);
	}

}
