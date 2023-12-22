
Feature: 
Scenario: DataStructure
    Given page open with datastructure getstarted button 
    When user click on getstarted button 
    Then The user is in the Data structures-Introduction page
Scenario: time complexity     
    Given The user is in the Data structures-Introduction page
    When The user clicks Time Complexity button
    Then the user is in Time comlexity page of Data structure-introduction
Scenario: practiseQuestion
    Given the user is in Time comlexity page of Data structure-introduction
    When The user click in the Practise question button
    Then The user should be redirected to Practice Questions of Data structures-Introduction
Scenario: try here 
    Given the user is in Time comlexity page of Data structure-introduction
    When  The user clicks Try  button
    And   the user enter "print Hi"
    When  the user click on run button 
    Then The user should be redirected to a page having an tryEditor with a Run button to test
 