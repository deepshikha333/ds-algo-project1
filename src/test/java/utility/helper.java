package utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helper extends baseclass {
	public static WebDriverWait wait ;
    public final static int TIMEOUT = 2;
	public void gettitle() {
		String text=driver.getTitle();
		System.out.println(text);
	}
   public static void waitmethod() throws InterruptedException {
	wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));	
}
public void movetoElement(WebElement element) {
    Actions action=new Actions(baseclass.driver);
   action.moveToElement(element).build().perform();
} 
public void handleAlert() {
    WebDriverWait wait = new WebDriverWait(baseclass.driver,Duration.ofSeconds(30));
    wait.until(ExpectedConditions.alertIsPresent());
    Alert alt= baseclass.driver.switchTo().alert();
    alt.accept();
}
public void enterdataInTextBox(WebElement element, String text) {
	  Actions action = new Actions(baseclass.driver);
	  action.moveToElement(element).sendKeys(element, text).build().perform();
}
}

