package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//go to groww URL
		driver.get("https://login-v2.upstox.com/");
		
		FileInputStream file =new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstox.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		//enter the USERID
			String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys(UN);
		//Enter the Password
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
		//click on Sign in
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(2000);
		//Enter the Passcode
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='yob']")).sendKeys(PIN);
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click welcome
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//varify account
		 String actid = driver.findElement(By.xpath("//span[text()='akshay d.']")).getText();
		String extid="Akshay D.";
		boolean result = actid.equals(extid);
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
