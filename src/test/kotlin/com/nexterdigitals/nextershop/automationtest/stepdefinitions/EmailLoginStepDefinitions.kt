package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import com.nexterdigitals.nextershop.automationtest.login.Click
import com.nexterdigitals.nextershop.automationtest.login.Fill
import com.nexterdigitals.nextershop.automationtest.login.HeaderTop
import com.nexterdigitals.nextershop.automationtest.navigation.NavigateTo
import io.cucumber.java.Before
import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.GivenWhenThen
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast
import org.hamcrest.Matchers

class EmailLoginStepDefinitions {
    @Before
    fun setTheStage() {
        OnStage.setTheStage(OnlineCast())
    }

    @Given("^(.*) is on the Nextershop home page")
    fun onTheNextershopHomePage(actor: String) {
        OnStage.theActorCalled(actor).attemptsTo(NavigateTo.theNextershopHomePage())
    }

    @Given("He goes to login page")
    fun goesToLoginPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.theNextershopLoginPage())
    }

    @When("He enter an email as {string}")
    fun enterAnEmailAs(email: String) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.anEmailAs(email))
    }

    @When("He enter a password as {string}")
    fun enterAPasswordAs(password: String) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.aPasswordAs(password))
    }

    @When("He click the submit button")
    fun clickTheSubmitButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.submitButton())
    }

    @Then("He should be logged in as {string}")
    fun shouldBeLoggedInAs(expectedDisplayedName: String) {
        OnStage.theActorInTheSpotlight().should(
            GivenWhenThen.seeThat(
                "displayed name",
                HeaderTop.displayedName(),
                Matchers.equalTo(expectedDisplayedName)
            )
        )
    }
}
