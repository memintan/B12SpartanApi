Feature: Get All Spartans

  Scenario: Get All Spartans
    Given user accepts content type "application/json"
    When user sends GET request to "/api/spartans"
    Then user verifies that status code is 200