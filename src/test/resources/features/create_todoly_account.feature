Feature: Create account in todo.ly
  Scenario: As a end user I wan to create an account in todo.ly
    Given the user access "http://todo.ly" url
    And user click on Sign Un Free button
    When user enter the name "name" on Full Name field
    And enters the email "email address" on Email field
    And enters the password "password" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then user is logged in and account home page is displayed
