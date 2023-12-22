
Feature: 
  Scenario: register1
    Given The user opens Register Page 
    When The user enter below details
    |  |
    Then click on the registration button
    Then It should display an error "Please fill out this field" below username textbox 
   
  Scenario: register2 
     Given The user opens Register Page     
     When The user enter below details
     | aggdh |    | 
    Then click on the registration button
     Then It should display an error "Please fill out this field" below Password textbox
  Scenario: register3
     Given The user opens Register Page
     When  The user enter below details
     |sdgsfg|  gfdh|  |
     Then  It should display an error message "Please fill out this field" below passwordconfermationtxt box 
     
  Scenario: register4
     Given The user opens Register Page
     When  The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields
     |asdv|   asdf|    
     Then  It should display an error message "password_mismatch:The two password fields didn’t match."
 Scenario: register5  
     Given The user opens Register Page
     When  The user click "Register"button after entering spacial keyword in username field 
     |sf@#$| 
     Then It should be display an error message "Please enter valid user name"below the username box  
  Scenario: register6
     Given: The user opens Register Page  
     When The user enters a Password with characters less than 8
     |adafav|   
     Then It should display an error message "Password should contain atleast 8 characters"
  Scenario: register7
    Given The user opens Register Page 
     When The user enters a Password with only numbers 
     |2526346| 
     Then It should be display an error message "please emter valid password" below the passwod box
   Scenario: register8
     Given The user opens Register Page  
     When The user opens Register Page
     Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"