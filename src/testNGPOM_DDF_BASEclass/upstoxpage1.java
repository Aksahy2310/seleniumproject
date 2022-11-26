package testNGPOM_DDF_BASEclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxpage1 {
	
@FindBy(xpath = "//input[@name='userId']") private	WebElement ID;
@FindBy(xpath = "//input[@name='password']") private	WebElement PWD;
@FindBy(xpath = "//div[text()='Sign into Upstox']") private	WebElement SIGNUP ;

public upstoxpage1 (WebDriver driver){
	
	PageFactory.initElements(driver,this);
}

public void userid(String uk) {
	ID.sendKeys(uk);
}
public void password(String paswrd) {
	PWD.sendKeys(paswrd);
}
public void signclick() {
	SIGNUP.click();
}


}
