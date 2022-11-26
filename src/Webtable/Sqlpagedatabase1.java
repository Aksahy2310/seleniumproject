package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sqlpagedatabase1 {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Admin/Desktop/webtable.html");
      
    
      
     WebElement table = driver.findElement(By.xpath("//table[@id='1234']"));
      // focus on the table
   //  System.out.println(table.getText());
     
     List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='1234']//tr[2]"));
     
     for(WebElement all: table1) {
    	 
    	 System.out.println(all.getText());
     }
      
//   int  table1 = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
//      System.out.println(table1);
//       //   get row size
//      
//      int  table2 = driver.findElements(By.xpath(" (//table[@id='1234']//tr)[2]/td")).size();
//		System.out.println(table2);
//	//  grt cell size	
//		
//		for(int i=1;i<=3;i++) {
//			String text = driver.findElement(By.xpath("(//table[@id='1234']//tr)[2]/td["+i+"]")).getText();
//			System.out.println(text);
//		}
		
		
	}}


