package testNGparalleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltestingtestcase1 {
	@Test
	public void a1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
		
		WebDriver as=new ChromeDriver();
		
		as.get("https://www.instagram.com/");
		
	//	Thread.sleep(3000);
		
	}

}
