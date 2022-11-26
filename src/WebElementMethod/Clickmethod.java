package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver qw=new ChromeDriver();
		
		qw.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
	qw.findElement(By.xpath("//input[@type='text']")).sendKeys("8087971179");

    qw.findElement(By.xpath("//input[@type='password']")).sendKeys("845907a9k5");
Thread.sleep(4000);
      qw.findElement(By.xpath("//button[@type='submit']")).click();



}}
