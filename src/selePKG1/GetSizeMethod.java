package selePKG1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	
  WebDriver cv=new ChromeDriver();
  cv.get("https://paytm.com/ ");
   
  Thread.sleep(4000);
  
  Dimension zx =new Dimension(1000,500);
  cv.manage().window().setSize(zx);
  System.out.println(cv.manage().window().getSize());
  
  Thread.sleep(4000);
  
  Point sd=new Point(200,100);
  cv.manage().window().setPosition(sd);
  System.out.println(cv.manage().window().getPosition());
  
  Thread.sleep(4000);
 
	}

}
