package PopUpHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicechildbrowser {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver as=new ChromeDriver();
	
	as.get("https://skpatro.github.io/demo/links/");
	
	Thread.sleep(3000);
	
	Set<String> st = as.getWindowHandles();
	
	ArrayList<String> indx=new ArrayList<String>(st);
	
	String getid=indx.get(2);
	
	System.out.println(getid);
	
	as.switchTo().window(getid);
	
	
	
	
		
	}

}
