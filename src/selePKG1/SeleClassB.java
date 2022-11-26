package selePKG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleClassB {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
WebDriver z=new ChromeDriver();

z.get("https://www.youtube.com/");

Thread.sleep(4000);
z.close();
		
  System.out.println(z.getCurrentUrl());
	}

}
