package testNG_With_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxpage3 {
	
	@FindBy( xpath ="//div[text()='No, I’m good']") private WebElement WC;
	
	 upstoxpage3 (WebDriver driver){
		 
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void welcome() {
		 
		 WC.click();
	 }

}
