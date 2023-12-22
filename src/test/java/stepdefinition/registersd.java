package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodal.register;
import utility.baseclass;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class registersd extends baseclass {
	public static register rgs;
	@Given("The user opens Register Page")
	public void The_user_opens_register_page() {
	    rgs=new register(baseclass.driver);
	    rgs.gettitle();
	}

	@When("The user enter below details")
	public void the_user_enter_below_details(DataTable dataTable) {
		List<String> list = dataTable.row(0) ;//String dataTable.row(0);
		rgs.userNameEnter(list.get(0)); 
	}

	@Then("click on the registration button")
	public void click_on_the_registration_button() {
	    rgs.registerbuttonclick();
	}

	@Then("It should display an error {string} below username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
	    rgs.messageValidation();
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
	   rgs.messagevalidationforp();
	}

	@Then("It should display an error message {string} below passwordconfermationtxt box")
	public void it_should_display_an_error_message_below_passwordconfermationtxt_box(String string) {
	    rgs.messagevalidationforcp();
	}

	@When("The user clicks {string} button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields( DataTable dataTable ) {
		List<String> list = dataTable.row(0) ;//String dataTable.row(0);
		rgs.password1 (list.get(0));
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	   rgs.passwordmissmatchmessage();
	}

	@When("The user click \"Register\"button after entering spacial keyword in username field")
	public void the_user_click_register_button_after_entering_spacial_keyword_in_username_field(DataTable dataTable) {
		List<String> list = dataTable.row(0) ;//String dataTable.row(0);
	rgs.userNameEnter(list.get(0));
	}

	@Then("It should be display an error message \"Please enter valid user name\"below the username box")
	public void it_should_be_display_an_error_message_please_enter_valid_user_name_below_the_username_box(String expectedResult ) {		
			  // Assert.assertEquals(rgs.userNameNotValid(), expectedResult);
			//Assert.assertEquals(expectedResult, rgs.userNameNotValid());
		rgs.userNameNotValid();
		Assert.assertEquals(rgs.str1,expectedResult) ;
	}		
	@When("The user enters a Password with characters less than {int}")
	public void the_user_enters_a_password_with_characters_less_than(Integer int1, io.cucumber.datatable.DataTable dataTable) {	   
		List<String> list = dataTable.row(0) ;//String dataTable.row(0);
		rgs.password1(list.get(0));		
	}

	@When("The user enters a Password with only numbers")
	public void the_user_enters_a_password_with_only_numbers(DataTable dataTable) {
		List<String> list = dataTable.row(0) ;//String dataTable.row(0);
		rgs.password1(list.get(0));    
	}

	@Then("It should be display an error message {string} below the passwod box")
	public void it_should_be_display_an_error_message_below_the_passwod_box(String expectedResult) {
		rgs.passWordNotValid();
		Assert.assertEquals(rgs.str3,expectedResult) ;
		
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	   
	}


	
}
	