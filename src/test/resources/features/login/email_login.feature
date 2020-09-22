Feature: Login

  Customer can login with username and password

  Scenario: Login with correct credential
    Given Natthachayakorn is on the Nextershop home page
    And He goes to login page
    When He enter a username as "nextershop@nextershop.com"
    And He enter a password as "NextSh0p@12345678"
    And He click the submit button
    Then He should be logged in as "nextershop"
