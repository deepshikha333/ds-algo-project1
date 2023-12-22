package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import excelsheet.excelreader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodal.Graph;
import utility.baseclass;

public class graphsd extends baseclass {
	public static Graph gp;
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		launchdriver();
		gp = new Graph (baseclass.driver);
	}

	@When("The user clicks the Getting Started button in Graph Pane or select Graph item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_graph_pane_or_select_graph_item_from_the_drop_down_menu() {
	   gp.clickongetstarted();
	}

	@Then("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() {
	   gp.gettitle();
	}

	
	@When("The user clicks Graph button")
	public void the_user_clicks_graph_button() {
	    gp.cickongraph();
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
	    gp.gettitle();
	}

	@Then("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
	    gp.Gtryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    gp.gettitle();
	}

	@When("The user clicks Graph Representations button")
	public void the_user_clicks_graph_representations_button() {
	    gp.clickongraphRP();
	}

	@Then("The user should be directed to Graph Representations Page")
	public void the_user_should_be_directed_to_graph_representations_page() {
	   gp.gettitle();
	}
	@When("user enters {string} and rowNumber {int}")
	public void user_enters_and_row_number(String sheetName , Integer rowNumber) throws InvalidFormatException, IOException {
		excelreader reader = new excelreader();
		List<Map<String,String>> Datasheet = 
	reader.getData("C:\\deepshikha\\eclipse-workspace\\Ds-algo-project1\\src\\test\\resources\\datasheet\\datatablesheet.xlsx", sheetName);
	String input = Datasheet.get(rowNumber).get("Input");
   // String output= testData.get(rowNumber).get("output");
     gp.entertext();
	}
	@Then("user runbutton")
	public void user_runbutton() {
	    gp.clickonRun();
	}

	@Then("user can see output")
	public void user_can_see_output() {
	    gp.getOutput();
	}
	/*@Then("The user should be redirected to a page having an {string} with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_with_a_button_to_test(String string, String string2) {
	    gp.gettitle();
	}*/



}