package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.cucumber.messages.types.Duration;

public class baseclass {
	  
	public static WebDriver driver;
	public String browser="chrome";
	public baseclass() {
			launchdriver();
		 }
public void launchdriver() {
	if(driver==null) {
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
}
	if(browser.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
}
	driver.get("https://dsportalapp.herokuapp.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
}
}	
}	
	
	
	
	
	
	