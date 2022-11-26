package ListBox_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SelectDateMonthYear {
	
public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
WebDriver gh=new ChromeDriver();

gh.get("https://www.facebook.com/");

gh.manage().window().maximize();
gh.findElement(By.xpath("(//a[@role='button'])[2]")).click();

Thread.sleep(2000);

 WebElement ab1= gh.findElement(By.xpath("//select[@id='day']"));
 WebElement ab2= gh.findElement(By.xpath("//select[@id='month']"));
 WebElement ab3= gh.findElement(By.xpath("//select[@id='year']"));
 
 SelectDateMonthYear.selectclass(ab1, "23");
 SelectDateMonthYear.selectclass(ab2, "Jul");
 SelectDateMonthYear.selectclass(ab3, "1994");
 
 
//  Select k1=new Select(ab1);
//  Select k2=new Select(ab2);
//  Select k3=new Select(ab3);
//  
//  k1.selectByIndex(22);
//  k2.selectByValue("10");
//  k3.selectByVisibleText("1994");
  

 


 
 
	}

public static void selectclass(WebElement element,String text)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}

}
