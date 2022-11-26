package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
		
		WebDriver sd=new ChromeDriver();
		
		sd.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfb%20login%27%7C&placement=&creative=589460569900&keyword=fb%20login%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-370844460174%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXefrwNiVVaZ7a5L5zxEsPbr8B41T7aBj08_bkVzOseQqZqtYaag40OxoC1SsQAvD_BwE");
		
		Thread.sleep(3000);
		
	//	sd.findElement(By.xpath("//input[@value='2']")).isSelected();
		
	//	boolean output=sd.findElement(By.xpath("//input[@value='2']")).isSelected();
		
	//	System.out.println(output);
		
		// in selected method we simply check functionality
	//	  is selected or not
		
	sd.findElement(By.xpath("//div[@class='mbm _a4y']")).isSelected();
	
	boolean result=sd.findElement(By.xpath("//div[@class='mbm _a4y']")).isSelected();
	
	System.out.println(result);
	
		if(result==true) {
			System.out.println("icon selected ");
		}
		else {
			System.out.println("icon not selected ");
		}

}
}