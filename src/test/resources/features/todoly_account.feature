Feature: Todo-ly account

  Background:
    Given the user accesses "http://todo.ly" url

  @bvt @createAccount
  Scenario Outline: As an end user I want to create an account in todo.ly
    # Test Steps
    And user click on Sign Un Free button
    When user enters the "<user name>" on Full Name field
    And enters the "<email>" on Email field
    And enters the "<password>" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then account home page is displayed
    When user click on Logout link
    Then todo.ly home page is displayed
    When user click on Login button
    And enters "<email>" and "<password>" in Login modal
    And click Login on the modal
    Then account home page is displayed
    # Clean up data -> Needs to be improved by refactor
    When user access to Settings modal
    And accesses to Account tab in the Settings modal
    And click on Delete Account with All Data button in Settings modal
    And click on OK button of browser alert displayed
    Then todo.ly home page is displayed
    Examples:
      | user name        | email                | password |
      | rolando          | rolandoc1@mam.com    | 123456   |
      | rolando          | rolandoFL5@mam.com   | hjhj     |
      | rolando mam !@#$ | rolandoc1-d@mam.com  | asdf123  |
      | rolando_mam      | rolandoc1.d5@mam.com | !@#$%$   |
      | rolando-mam      | rolandoc1_5@mam.com  | as       |

  @bvt @changePassword
  Scenario Outline: As an end user I want to changes todo.ly account password
    # Setup data -> Needs to be improved by refactor
    And user click on Sign Un Free button
    When user enters the "rolando" on Full Name field
    And enters the "<email>" on Email field
    And enters the "<password>" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then account home page is displayed
    # Test steps
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
    # Clean up data -> Needs to be improved by refactor
    When user access to Settings modal
    And accesses to Account tab in the Settings modal
    And click on Delete Account with All Data button in Settings modal
    And click on OK button of browser alert displayed
    Then todo.ly home page is displayed
    Examples:
      | email              | password   | old password | new password                                                             |
      | rolandoch1@mam.com | 123asd#$%^ | 123asd#$%^   | 456789                                                                   |
      | rolandoch2@mam.com | 123456     | 123456       | 123asd#$%^                                                               |
      | rolandoch3@mam.com | 123456     | 123456       | sp                                                                       |
      | rolandoch4@mam.com | a          | a            | longpasslongpasslongpasslongpasslongpasslongpasslongpasslongpasslongpass |

  @bvt @deleteAccount
  Scenario Outline: As an end user I want to delete a todo.ly user account
    # Setup data -> Needs to be improved by refactor
    And user click on Sign Un Free button
    When user enters the "rolando" on Full Name field
    And enters the "<email>" on Email field
    And enters the "<password>" on Password field
    And checks the Terms of Service agreement checkbox
    And click on Signup on the modal
    Then account home page is displayed
    # Test steps
#    When user click on Login button
#    And enters "<email>" and "<password>" in Login modal
#    And click Login on the modal
#    Then account home page is displayed
    When user access to Settings modal
    And accesses to Account tab in the Settings modal
    And click on Delete Account with All Data button in Settings modal
    And click on OK button of browser alert displayed
    Then todo.ly home page is displayed
    # Clean up data -> Needs to be improved by refactor
    When user click on Login button
    And enters "<email>" and "<password>" in Login modal
    Then click on login and login modal still displayed
    Examples:
      | email                | password    |
      | rolandod1@mam.com    | 123abcf@#$% |
      | rolandod2@mam.com    | 123456      |
      | rolandod3-d@mam.com  | @#$#@       |
      | rolandod4.d5@mam.com | a b         |
      | rolandod5_5@mam.com  | d           |