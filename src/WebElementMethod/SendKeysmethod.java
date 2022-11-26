package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysmethod {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
	WebDriver qw=new ChromeDriver();
	
	qw.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805682%7Cb%7Cfb%27%27%27%27%7C&placement=&creative=550525805682&keyword=fb%27%27%27%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327681933321%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXefc8OsMwPjpFEvFk66viKRN6a3ceKA1JfWBEY-TWBJ919pgkZNiDfRoCF74QAvD_BwE");
	
	Thread.sleep(3000);
	qw.findElement(By.xpath("//input[@type='text']"));
	
	WebElement nm=qw.findElement(By.xpath("//input[@type='text']"));
	// create an object of particular X path
	
	nm.click();
	nm.sendKeys("akshay");
	Thread.sleep(3000);
	nm.clear();
	nm.sendKeys("rushi");
	Thread.sleep(3000);
	nm.clear();
	nm.sendKeys("ashok");
	
	
	
	}

}
