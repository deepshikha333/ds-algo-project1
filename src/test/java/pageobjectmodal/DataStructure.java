package pageobjectmodal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import utility.helper;

public class DataStructure extends helper{
	public WebDriver driver;
	By GetStarted = By.xpath("/html/body/div[2]/div[1]/div/div/a");
    By TimeComplexity = By.xpath("/html/body/div[2]/ul/a");
    By PractiseQuestions=By.id("//*[@id=/data-structures-introduction/practice]/a");
    By TryHere= By.xpath("/html/body/div[2]/div/div[2]/a");
    By Textbox=By.id("//*[@id=\"answer_form\"]/div/div/div[6]");
    By Run=By.xpath("//*[@id=\"answer_form\"]/button");
    public DataStructure (WebDriver driver) { 
    	this.driver=driver;
    }
    public void clickongetstartedbttn() {
       driver.findElement(GetStarted).click();
       }
    public void timecomplexity() {
    	driver.findElement(TimeComplexity).click();
    }
    public void practisequestionbtn() {
    	driver.findElement(PractiseQuestions).click();
    }
    public void tryherebtn() {
    	driver.findElement(TryHere).click();
    }
    public void enterOnTextbox(String text)  {
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(Textbox));
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(Textbox)).sendKeys(driver.findElement(Textbox), text).build().perform();
	
	}
    public void clickOnRun() {
		driver.findElement(Run).click();
		
	}
	
	}
	

