Feature: Email login

  Customer can login with username and password

  Scenario: Login with correct credential
    Given Natthachayakorn is on the Nextershop home page
    And he tries to close the popup if there is any
    And he goes to login page
    When he enters an email as "heretic.kekhuay@gmail.com"
    And he enters a password as "L^opNso7j'nex"
    And he clicks the submit button
    Then he should be logged in

  Scenario: Login with incorrect credential
    Given Natthachayakorn is on the Nextershop home page
    And he tries to close the popup if there is any
    And he goes to login page
    When he enters an email as "heretic.kekhuay@gmail.com"
    And he enters a password as "thisisawrongpassword"
    And he clicks the submit button
    Then he should not be logged in
