package ListBox_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scripts1 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver as=new ChromeDriver();
	
	as.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	
	as.manage().window().maximize();
	
	Thread.sleep(2000);
	as.findElement(By.xpath("//span[@class='KPnG0']")).click();
	Thread.sleep(2000);
	as.findElement(By.xpath("//a[@class='_97w5']")).click();
	
	WebElement ab1=as.findElement(By.xpath("//select[@id='day']"));
	WebElement ab2=as.findElement(By.xpath("//select[@id='month']"));	
	WebElement ab3=as.findElement(By.xpath("//select[@id='year']"));
	
	Select xy1=new Select(ab1);
	Select xy2=new Select(ab2);
	Select xy3=new Select(ab3);
	
	xy1.selectByIndex(22);
	xy2.selectByIndex(9);
	xy3.selectByValue("1994");
	
	as.findElement(By.xpath("//label[text()='Male']")).click();
	
	
	
	
	
	
	}

}
