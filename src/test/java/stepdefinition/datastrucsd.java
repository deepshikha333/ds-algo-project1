
package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodal.DataStructure;
import utility.baseclass;

public class datastrucsd extends baseclass{
	public static DataStructure ds;
	@Given("page open with datastructure getstarted button")
	public void page_open_with_datastructure_getstarted_button() {
		launchdriver();
		ds = new DataStructure (baseclass.driver);
		ds.gettitle();
	}

	@When("user click on getstarted button")
	public void user_click_on_getstarted_button() {
	    ds.clickongetstartedbttn();
	}

	@Then("The user is in the Data structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
	   ds.gettitle();
	}
	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
      ds.timecomplexity();
	}

	@Then("the user is in Time comlexity page of Data structure-introduction")
	public void the_user_is_in_time_comlexity_page_of_data_structure_introduction() {
       ds.gettitle();
	}
	@When("The user click in the Practise question button")
	public void the_user_click_in_the_practise_question_button() {
        ds.practisequestionbtn();
	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	ds.gettitle();
	}

	@When("The user clicks Try  button")
	public void the_user_clicks_try_button() {
	    ds.tryherebtn();
	}

	@When("the user enter {string}")
	public void the_user_enter(String text) {
		System.out.println("i am on textbox");	
		  ds.enterOnTextbox(text);
	}

	@When("the user click on run button")
	public void the_user_click_on_run_button() {
		System.out.println("I am on  run button");
		  ds.clickOnRun(); 
	}

}


