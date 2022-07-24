Feature: Todo-ly account

  Background:
    Given the user accesses "http://todo.ly" url


  @bvt
  Scenario Outline: As an end user I want to create an account in todo.ly
    And user click on Sign Un Free button
    When user enters the "<user name>" on Full Name field
    And enters the "<email>" on Email field
    And enters the "<password>" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then account home page is displayed
    Examples:
      | user name | email            | password |
      | rolando   | rolando3@mam.com | 123456   |


  @bvt
  Scenario Outline: As an end user I want to changes todo.ly account password
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
      | rolando3@mam.com | 456789   | 456789       | 123456       |


  @bvt
  Scenario Outline: As an end user I want to delete a todo.ly user account
    When user click on Login button
    And enters "<email>" and "<password>" in Login modal
    And click Login on the modal
    Then account home page is displayed
    When user access to Settings modal
    And accesses to Account tab in the Settings modal
    And click on Delete Account with All Data button in Settings modal
    And click on OK button of browser alert displayed
    Then todo.ly home page is displayed
    Examples:
      | email            | password |
      | rolando3@mam.com | 123456   |
