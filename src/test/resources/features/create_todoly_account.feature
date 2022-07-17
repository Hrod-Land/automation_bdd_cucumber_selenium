Feature: Create account in todo.ly
  Scenario: As a end user I wan to create an account in todo.ly
    Given the user access "http://todo.ly" url
    When user click on "Sign Un Free" button
    Then "Signup" modal is displayed
    When user enter the "name" on "Full Name" field
    And enter the emails address on "Email" field
    And enter the password on "Password" field
    And checks the "Terms of Service" agreement checkbox
    And click on "Signup" button on the modal
    Then the new account is created and logged in
    And home page for the new user is displayed.
