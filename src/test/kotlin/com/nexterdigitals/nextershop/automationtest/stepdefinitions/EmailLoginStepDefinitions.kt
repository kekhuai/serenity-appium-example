package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class EmailLoginStepDefinitions {
    @Given("Natthachayakorn is on the Nextershop home page")
    fun onTheNextershopHomePage() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Given("He goes to login page")
    fun goesToLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("He enter an email as {string}")
    fun enterAnEmailAs(email: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("He enter a password as {string}")
    fun enterAPasswordAs(password: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("He click the submit button")
    fun clickTheSubmitButton() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("He should be logged in as {string}")
    fun shouldBeLoggedInAs(expectedDisplayedName: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }
}
