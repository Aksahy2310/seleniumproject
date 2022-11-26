package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBsignupPage {
	
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@rel='async']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("akash");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kanase");
driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("akshayakshaykanase2310");
driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("808797ak79");
Thread.sleep(2000);

WebElement ab1= driver.findElement(By.xpath("//select[@id='day']"));
WebElement ab2= driver.findElement(By.xpath("//select[@id='month']"));
WebElement ab3= driver.findElement(By.xpath("//select[@id='year']"));

Select k1=new Select(ab1);
Select k2=new Select(ab2);
Select k3=new Select(ab3);

k1.selectByIndex(22);
k2.selectByValue("10");
k3.selectByVisibleText("1994");

driver.findElement(By.xpath("//input[@value=\"2\"]")).click();





}

}
