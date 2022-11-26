package POMclasswithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxpage4 {
	
@FindBy(xpath = "//span[text()='akshay d.']") 	private WebElement user;

public upstoxpage4 (WebDriver driver){
	
	PageFactory.initElements(driver, this);
}

public void Accholdername(String actid) {
	
	user.getText();
	
	String extid="Akshay D.";
	boolean result = user.equals(extid);
	System.out.println("Result:"+result);
	
	if(result=true)
	{
		System.out.println("TC PASS :Valid Usr");
	}
	else
	{
	System.out.println("TC Fail :inValid Usr");
	}	
	
}
}
