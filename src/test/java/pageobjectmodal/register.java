package pageobjectmodal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.helper;

public class register extends helper {
	 public  WebDriver driver;
	public static String str1, str2, str3;
		By Register1 = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
		By UserName = By.id("id_username");
		By Password= By.id("id_passeord");
		By Passwordconfirmation = By.id("id_password2");
	    By Passwordmissmatchmsg=By.id("//div[@class=\"alert alert-primary\"]");
		By Register = By.xpath("/html/body/div[2]/div/div[2]/form/input[5]");
	public register(WebDriver driver) {	
	}
	public void clickonregisterbttn(){
		
	}
	public void userNameEnter(String username) {
		driver.findElement(UserName).sendKeys(username);
	}
	public void password1(String passwordA) {
			driver.findElement(Password).sendKeys(passwordA);
	}
	public void password2(String passwordB) {
		driver.findElement(Passwordconfirmation).sendKeys(passwordB);
	}
	public void registerbuttonclick() {
		driver.findElement(Register).click();
	}
	public String messageValidation() {
		driver.findElement(UserName).clear();
		String usertext=driver.findElement(UserName).getAttribute("validationMessage");
			System.out.println("usertextbox"+usertext);	
			return usertext;
			}
	public String messagevalidationforp() {
		driver.findElement(Password).clear();
		String passwordtext=driver.findElement(Password).getAttribute("validationmessage");
		  System.out.println("passwordtextbox"+passwordtext);
		  return passwordtext;
	}
		  
	public String messagevalidationforcp() {
		driver.findElements(Passwordconfirmation).clear();
		String passwordconfirmtext=driver.findElement(Passwordconfirmation).getAttribute("messagevalidation");
		System.out.println("passwordconfirmtextbox"+passwordconfirmtext);
		return passwordconfirmtext;
		}
	
	public  String passwordmissmatchmessage() {
		WebElement TxtBoxContent = driver.findElement(Passwordmissmatchmsg);
		str1=TxtBoxContent.getText();
		System.out.println("Printing " + TxtBoxContent);
		return str1;
		}
	public String  userNameNotValid() {
		WebElement TxtBoxContent = driver.findElement(Passwordmissmatchmsg);
		str2= TxtBoxContent.getText();
		System.out.println("Printing " + TxtBoxContent);
		return str2;
	}
	public String  passWordNotValid() {
		WebElement TxtBoxContent = driver.findElement(Passwordmissmatchmsg);
		str3= TxtBoxContent.getText();
		System.out.println("Printing " + TxtBoxContent);
		return str3;
	}
	
}

