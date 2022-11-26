package testNGwithPOM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxpage2 {
	
	@FindBy(xpath = " //input[@name='yob']") private WebElement PIN;
	
	public upstoxpage2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void OTP (String pin) {
		
		PIN.sendKeys(pin);
	}

}
