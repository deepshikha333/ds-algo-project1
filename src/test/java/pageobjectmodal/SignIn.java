package pageobjectmodal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	public WebDriver driver ;
		By Signin = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
		By UserName = By.id("id_username");
		By Password= By.id("id_password");
		By Login = By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
		
	
	public SignIn(WebDriver driver) {	
	}
	public void clickonsigninbttn() {
	    driver.findElement(Signin).click();
	}
	public void username() {
		driver.findElement(UserName).sendKeys("Ninjabonds");
	}
	public void password() {
		driver.findElement(Password).sendKeys("Ninja@123");	
	}
	public void login() {
		driver.findElement(Login).click();   
	}

}
