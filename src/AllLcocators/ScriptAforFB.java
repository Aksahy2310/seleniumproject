package AllLcocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptAforFB {
	
public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		WebDriver nm=new ChromeDriver();
       nm.get("https://www.facebook.com/");      // 1st URL
		
       // nm.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569867%7Cb%7Cfb%20create%20new%20account%7C&placement=&creative=589460569867&keyword=fb%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-301748645679%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwmouZBhDSARIsALYcoupQSzD66cYAex64r_vR11_tVZW9AT3jn025fzfk0S9hzGhSXSwNOsoaAisqEALw_wcB");
		Thread.sleep(3000);                  //   2nd URL
		
   nm.findElement(By.tagName("input")).click(); // tagname method  1st URL
		nm.navigate().back();
		Thread.sleep(3000);
   nm.findElement(By.linkText("Help")).click();   //    linktest method
		nm.navigate().back();
		Thread.sleep(3000);
 nm.findElement(By.partialLinkText("For")).click(); // partial linktest method
		nm.navigate().back();
		Thread.sleep(3000);
  nm.findElement(By.className("_sv4")).click();      // classname method
		nm.navigate().back();
		Thread.sleep(3000);
 	nm.findElement(By.className("_8esh")).click();	  //  classname method
		nm.navigate().back();
		Thread.sleep(3000);
	nm.findElement(By.id("u_0_0_\\/o")).click();     //   id method
		nm.navigate().back();
		Thread.sleep(3000);
  //  nm.findElement(By.name("lastname")).sendKeys("kanase");   // 2nd URL
    
   // nm.findElement(By.id("password_step_input")).sendKeys("Akshay@123");
    
    
}}


//#u_0_0_\/o