Feature:
  Scenario: open link
    Given the user should land in DS Algo portel page
    When The user opens DS Algo portal link "https://dsportalapp.herokuapp.com/"
    Then the user should land in DS Algo portel page
   
   Scenario: Getstarted
    Given the user should land in DS Algo portel page
    When  The user clicks the "Get Started" button
    Then  The user opens Home Page  
     
  Scenario: homepage data structure dropdown 
    Given The user opens Home Page
    When  The user clicks "Data Structures" drop down
    Then I shouls see 6 different data structure entries in that dropdown
    When The user selects any data structures item from the drop down without Sign in.
    Then It should alert the user with a message "You are not logged in"
   
  Scenario: homepage datastructure getstarted button 
    Given The user opens Home Page
    When  The user clicks any of the "Get Started" buttons below the data structures 
    Then  It should alert the user with a message "You are not logged in"

  Scenario: homepage signin 
    Given The user opens Home Page 
    When  User click in signin button 
    Then  The user should be redirected to Sign in page
 
  Scenario: home page register
    Given The user opens Home Page 
    When  User click in register button 
    Then  The user should be redirected to register page          
    

  