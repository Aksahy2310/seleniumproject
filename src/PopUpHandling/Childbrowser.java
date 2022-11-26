package PopUpHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get method
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on new tab
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		//get the child window ID
				Set<String> allId = driver.getWindowHandles();//[mainpageID,childpageID]
				
	    ArrayList<String> al=new ArrayList<String>(allId);
				         
									String childpageID = al.get(1);
									String mainpageId = al.get(0);
									System.out.println(mainpageId);
									System.out.println(childpageID);
									
		//click on child browser
		driver.switchTo().window(childpageID);
		
		//click on traning option
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		//click on switch on main browser page
	    driver.switchTo().window(mainpageId);
		
		//click on new window 
		driver.findElement(By.xpath("//input[@value='New Window']")).click();

	}

}


