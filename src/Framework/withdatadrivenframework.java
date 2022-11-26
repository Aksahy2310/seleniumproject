package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class withdatadrivenframework {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	 WebDriver driver =new ChromeDriver();
	  driver.get("https://login-v2.upstox.com/");
	  driver.manage().window().maximize();
FileInputStream fil = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstox.xlsx");
		
  Sheet sht = WorkbookFactory.create(fil).getSheet("Sheet1");
 Thread.sleep(2000);  
  String UN = sht.getRow(0).getCell(0).getStringCellValue();
  
  driver.findElement(By.xpath("//input[@name='userId']")).sendKeys(UN);
  
 String PWD= sht.getRow(0).getCell(1).getStringCellValue();
 
 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
 Thread.sleep(2000);
 
 String PIN = sht.getRow(0).getCell(2).getStringCellValue();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@name='yob']")).sendKeys(PIN);
 //Thread.sleep(4000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
 Thread.sleep(4000);
String actID =  driver.findElement(By.xpath("//span[text()='akshay d.']")).getText();
System.out.println(actID);
String expID = "Akshay D.";


  boolean result = actID.equals(expID);
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
  if(result = true) {
	  System.out.println("valid user");
  }else {
	  
	  System.out.println("invalid user");
  }
	}

}
