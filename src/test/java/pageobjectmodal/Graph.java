package pageobjectmodal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.helper;

public class Graph extends helper {
	public WebDriver driver;
	By GetStarted = By.xpath("/html/body/div[2]/div[7]/div/div/a");
	By Graph = By.xpath("/html/body/div[2]/ul[2]/a");
	By GraphReprestation = By.xpath("/html/body/div[2]/ul[3]/a");
	By GraphTryHere= By.xpath("/html/body/div[2]/div/div[2]/a");
	By GraphRepTryHere= By.xpath("/html/body/div[2]/div/div[2]/a");
	By Runbutton=By.xpath("//*[@id=\"answer_form\"]/button");
	By commandbox=By.id("//*[@id=\"answer_form\"]/div/div/div[6]");
	By Output   = By.id("output");
	public Graph(WebDriver driver) {	
		this.driver=driver;		
	}
	public void clickongetstarted() {
	   driver.findElement(GetStarted).click();
	   }
	public void cickongraph() {
		driver.findElement(Graph).click();
	}
	public void clickongraphRP() {
			driver.findElement(GraphReprestation).click();
	}
	public void Gtryhere() {
		driver.findElement(GraphTryHere).click();
	}	
	public void GRtryhere() {
		driver.findElement(GraphRepTryHere).click();
	}
	public void clickonRun() {
		driver.findElement(Runbutton).click();	
	}
	public void entertext() {
		driver.findElement(commandbox).click();
    }
	public void getOutput() {
		WebElement output= driver.findElement(Output);
		    output.getText();
		    System.out.println(output);
		  
	  }
	  
}
