Feature: Todo-ly account

  Scenario: As an end user I want to create an account in todo.ly
    Given the user accesses "http://todo.ly" url
    And user click on Sign Un Free button
    When user enter the name "rolando3" on Full Name field
    And enters the email "rolando3@mam.com" on Email field
    And enters the password "123456" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then account home page is displayed

  Scenario Outline: As an end user I want to changes todo.ly account password
    Given the user accesses "http://todo.ly" url
    When user click on Login button
    And enters "<email>" and "<password>" in Login modal
    And click Login on the modal
    Then account home page is displayed
    When user access to Settings modal
    And then access to Profile tab in the Settings modal
    When enter the "<old password>" and "<new password>"
    And click OK in the Settings modal
    Then account home page is displayed
    When user click on Logout link
    Then todo.ly home page is displayed
    When user click on Login button
    And enters "<email>" and "<new password>" in Login modal
    And click Login on the modal
    Then account home page is displayed
    Examples:
      | email            | password | old password | new password |
      | rolando3@mam.com | 123456   | 123456       | 456789       |
      | rolando3@mam.com | 456789   | 456789       | abcdef       |
      | rolando3@mam.com | abcdef   | abcdef       | qwerty       |
      | rolando3@mam.com | qwerty   | qwerty       | 123456       |
      | rolando3@mam.com | 123456   | 123456       | 456789       |
      | rolando3@mam.com | 456789   | 456789       | 123456       |
