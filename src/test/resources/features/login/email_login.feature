Feature: Login

  Customer can login with username and password

  Scenario: Login with correct credential
    Given Natthachayakorn is on the Nextershop home page
    And he goes to login page
    When he enters an email as "nextershop@nextershop.com"
    And he enters a password as "NextSh0p@12345678"
    And he clicks the submit button
    Then he should be logged in
