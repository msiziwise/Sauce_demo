Feature: Sauce Demo navigation

  Scenario Outline: Login to Sauce Demo
    Given user is on the login page
    And user enters username <user_name>
    And user enters password <password>
    Then user clicks on the login button
    Examples:
      | user_name     | password     |
      | standard_user | secret_sauce |