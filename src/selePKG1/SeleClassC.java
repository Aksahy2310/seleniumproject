package selePKG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleClassC {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
   WebDriver xyz = new ChromeDriver();
   
   xyz.get("https://www.youtube.com/");
    Thread.sleep(4000);
//   xyz.manage().window().maximize();
//   Thread.sleep(4000);

   xyz.get("https://www.zomato.com/");
   
   Thread.sleep(4000);
   
   xyz.get("https://www.goibibo.com/");
   
   xyz.close();
	}

}
