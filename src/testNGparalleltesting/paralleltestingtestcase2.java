package testNGparalleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltestingtestcase2 {

	@Test
	public void x1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
}
