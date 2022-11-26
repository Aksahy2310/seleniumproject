package selePKG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
WebDriver qw=new ChromeDriver();

qw.get("https://paytm.com/");
Thread.sleep(4000);
qw.navigate().forward();

qw.get("https://pay.google.com/about/");
Thread.sleep(4000);
qw.navigate().forward();

qw.get("https://www.phonepe.com/");
Thread.sleep(4000);

qw.navigate().refresh();

Thread.sleep(3000);



	}

}
//  https://paytm.com/               paytm

//  https://pay.google.com/about/    Gpay

//  https://www.phonepe.com/         phonepe