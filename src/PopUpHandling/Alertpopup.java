package PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\ChromeDriver\\chromedriver.exe");
	  WebDriver drive=new ChromeDriver();
		    
	  drive.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_columns");
	  Thread.sleep(2000);
	  
	  drive.findElement(By.xpath("//button[@id='restoreDBBtn']")).click();
	  
	  Alert alrt=drive.switchTo().alert();
	  
	  String alt=drive.switchTo().alert().getText();
	
	  System.out.println(alt);
	  
  //  drive.switchTo().alert().dismiss();
	  drive.switchTo().alert().accept();

		
	  
	
	
	

	}

}
