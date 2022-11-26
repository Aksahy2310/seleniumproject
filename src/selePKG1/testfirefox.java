package selePKG1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class testfirefox {
	
public static void main(String[] args) {
	
	

System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\geckodriver firefox\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
	
 driver.get("https://www.facebook.com/");
		
	}

}
