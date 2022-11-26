package ListBox_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\selenium\\chromedriver.exe");
	      WebDriver qw=new ChromeDriver();
	      qw.get("https://www.facebook.com/");
	      qw.findElement(By.xpath("//a[@rel='async']")).click();
	      Thread.sleep(2000);
	      
		WebElement as=qw.findElement(By.xpath("//select[@id='month']"));
			
	    Select zx=new Select(as);
	    
	    List<WebElement>  ui= zx.getOptions();  // get Size of ListBox
	    System.out.println(ui.size());
	    System.out.println("============****==========");
	    
	    List<WebElement> gh=  zx.getAllSelectedOptions();
	    for(WebElement W:gh) {
	    	System.out.println(W.getText());
	    }
	    System.out.println("============****==========");  
	    
	    List<WebElement> bn= zx.getOptions();
	    for(WebElement E:bn) {
	    	System.out.println(E.getText());
	    }
//	    System.out.println("============****=========="); 
//	    
//	    WebElement nm=  zx.getFirstSelectedOption();
//	
//	    System.out.println(nm.getText());
//	  
//	    System.out.println("============****==========");
//	    
//	    boolean sd= zx.isMultiple();
//	    System.out.println(sd);
//	    
//	    System.out.println("============****==========");
//	    
//	    
//	    
	    
	    
			

}}
