Feature: Create account in todo.ly
  Scenario: As a end user I wan to create an account in todo.ly
    Given the user access "http://todo.ly" url
    And user click on Sign Un Free button
    When user enter the name "rolando1" on Full Name field
    And enters the email "rolando1@mam.com" on Email field
    And enters the password "123456" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then user is logged in and account home page is displayed
