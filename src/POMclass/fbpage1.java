package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbpage1 {
	
@FindBy(xpath = "//input[@name='email']")	private WebElement ID;
@FindBy(xpath = "//input[@name='pass']")	private WebElement PWD;
@FindBy(xpath = "//button[@name='login']")	private WebElement LOG;
	
	public fbpage1(WebDriver driver){
		 
		 PageFactory.initElements(driver, this);
	 }

	public void userId(String U) {
		
		ID.sendKeys(U);
		}
	public void password(String P) {
		
		PWD.sendKeys(P);
	}
	public void login() {
		LOG.click();
	}
}
