package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodal.homepage;
import utility.baseclass;

public class homepageSD extends baseclass{
	 public static homepage hp;
	@Given("the user should land in DS Algo portel page")
	public void the_user_should_land_in_ds_algo_portel_page() {
		launchdriver();
		hp = new homepage (baseclass.driver);
	}
	@When("The user opens DS Algo portal link {string}")
	public void the_user_opens_ds_algo_portal_link(String string) {
		
		driver.get(string);
		System.out.println("i am on ds algo page");
	    
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		//hp = new homepage (baseclass.driver);
		hp.clickongetstarted1();
	   
	}

	@Then("The user opens Home Page")
	public void the_user_opens_home_page() {
		   hp.gettitle();
		}

	@Then("The user should see {int} panals with different data structures")
	public void the_user_should_see_panals_with_different_data_structures(Integer int1) {
	  System.out.println("user can see 6 different penal");
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) {
		//hp = new homepage (driver);
		hp.clickondropdownbtn();
	}

	@Then("I shouls see {int} different data structure entries in that dropdown")
	public void i_shouls_see_different_data_structure_entries_in_that_dropdown(Integer int1) throws InterruptedException {
		hp.dropdownmenu();
		//hp.waitmethod();
	}

	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	   hp.dropdowngraph();
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String string) {
	   hp.erromassage();
	}

	@When("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
		hp.clickongetstarted();
	}

	

	@When("User click in signin button")
	public void user_click_in_signin_button() {
		//hp = new homepage (driver);
		hp.clickonsignin();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	   hp.gettitle();
	}

	

	@When("User click in register button")
	public void user_click_in_register_button() {
		//hp = new homepage (driver);
		hp.clickonregister();
	}

	@Then("The user should be redirected to register page")
	public void the_user_should_be_redirected_to_register_page() {
	    hp.gettitle();
	}




}
