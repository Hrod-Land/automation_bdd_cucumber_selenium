Feature: Todo-ly account
    Scenario: As an end user I want to create an account in todo.ly
        Given the user access "http://todo.ly" url
        And user click on Sign Un Free button
        When user enter the name "rolando1" on Full Name field
        And enters the email "rolando1@mam.com" on Email field
        And enters the password "123456" on Password field
        And checks the Terms of Service agreement checkbox
        And click on Signup on the modal
        Then account home page is displayed

      Scenario: As an end user I want to changes todo.ly account password
        Given the user access "http://todo.ly" url
        When user click on Login button
        And enters user name and password in Login modal
            |email|rolando1@mam.com|
            |password|123456       |
        And click Login on the modal
        Then account home page is displayed
        When user access to Settings modal
        And then access to Profile tab in the Settings modal
        When enters old password on Old password field
        And enters new password on New Password field
        And click OK in the Settings modal
        Then account home page is displayed
        When user click on Logout link
        Then todo.ly home page is displayed
        When user click on Login button
        And enters user name and password in Login modal
          |email|rolando1@mam.com|
          |password|123456       |
        And click Login on the modal
        Then account home page is displayed
