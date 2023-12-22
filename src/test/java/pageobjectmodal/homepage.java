package pageobjectmodal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.baseclass;
import utility.helper;

public class homepage extends helper {

	 public WebDriver driver;
	    By GetStarted1 = By.xpath("/html/body/div[1]/div/div/a/button");
	    By DSdropdown = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	    By DSdropdownmenu = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div");
	    By DSdropdowngraph=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]");
	    By GetStarted = By.xpath("/html/body/div[3]/div[1]/div/div/a");
		By errormsg = By.xpath("/html/body/div[2]");
		By signin = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]");
		By register = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
		
	public homepage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clickongetstarted1() {
			driver.findElement(GetStarted1).click();
		}
	
	public void clickondropdownbtn() {
		//movetoElement(driver.findElement(DSdropdown));
		//clickonwebElement(driver.findElement(DSdropdown),10);
		driver.findElement(DSdropdown).click();
	}
	public void dropdownmenu() throws InterruptedException {
		//movetoElement(driver.findElement(DSdropdownmenu));
		//clickonwebElement(driver.findElement(DSdropdownmenu),10);
		driver.findElement(DSdropdownmenu).click();
		//waitmethod();
	}
	
	public void dropdowngraph() {
	//WebElement Selectlist=driver.findElement(DSdropdownmenu);
		//Select select =new Select(Selectlist); 
		//select.selectByValue("Graph");
		//movetoElement(driver.findElement(DSdropdowngraph));
		//clickonwebElement(driver.findElement(DSdropdowngraph),10);
		driver.findElement(DSdropdowngraph).click();
	}
	public void clickongetstarted() {
		driver. findElement(GetStarted).click();
	}
	public void erromassage() {
		driver.findElement(errormsg).click();
	}
	public void clickonsignin() {
		driver.findElement(signin).click();
	}
	public void clickonregister() {
		driver.findElement(register).click();
	}
}


