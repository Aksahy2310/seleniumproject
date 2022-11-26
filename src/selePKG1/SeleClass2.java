package selePKG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleClass2 {

public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\selenium\\chromedriver.exe");
	
    
      WebDriver abc=new ChromeDriver();

      abc.get("https://www.google.com/search?gs_ssp=eJzj4tbP1TcwNDarKjY2UGA0YHRg8GLOr8wHADvGBTE&q=oyo&oq=oy&aqs=chrome.1.69i57j46i39i199i465j0i67j46i67i433j0i67i433l2j69i60l2.5262j0j7&sourceid=chrome&ie=UTF-8");
      
     Thread.sleep(5000);
     
     abc.close();
      
    //  
}
}