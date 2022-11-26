package AbsoluteXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
	
public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver nm=new ChromeDriver();

		nm.get("C:\\Users\\Admin\\Desktop\\KanaseBrothers.html");

		Thread.sleep(3000);
		
		nm.findElement(By.xpath("html/body/div[1]/input[3]")).sendKeys("8087971179");
		
		

}
}