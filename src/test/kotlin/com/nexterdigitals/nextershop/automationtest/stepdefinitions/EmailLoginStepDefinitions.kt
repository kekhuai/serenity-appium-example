package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import com.nexterdigitals.nextershop.automationtest.login.Click
import com.nexterdigitals.nextershop.automationtest.login.Fill
import com.nexterdigitals.nextershop.automationtest.login.HeaderTop
import com.nexterdigitals.nextershop.automationtest.navigation.NavigateTo
import io.cucumber.java.Before
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.GivenWhenThen
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast
import org.hamcrest.Matchers

class EmailLoginStepDefinitions {
    @Before
    fun setTheStage() {
        OnStage.setTheStage(OnlineCast())
    }

    @Given("{actor} is on the Nextershop home page")
    fun onTheNextershopHomePage(actor: Actor) {
        actor.wasAbleTo(NavigateTo.theNextershopHomePage())
    }

    @Given("{actor} goes to login page")
    fun goesToLoginPage(actor: Actor) {
        actor.wasAbleTo(NavigateTo.theNextershopLoginPage())
    }

    @When("{actor} enters an email as {string}")
    fun enterAnEmailAs(actor: Actor, email: String) {
        actor.attemptsTo(Fill.anEmailAs(email))
    }

    @When("{actor} enters a password as {string}")
    fun enterAPasswordAs(actor: Actor, password: String) {
        actor.attemptsTo(Fill.aPasswordAs(password))
    }

    @When("{actor} clicks the submit button")
    fun clickTheSubmitButton(actor: Actor) {
        actor.attemptsTo(Click.submitButton())
    }

    @Then("{actor} should be logged in as {string}")
    fun shouldBeLoggedInAs(actor: Actor, expectedDisplayedName: String) {
        actor.should(
            GivenWhenThen.seeThat(
                "displayed name",
                HeaderTop.displayedName(),
                Matchers.equalTo(expectedDisplayedName)
            )
        )
    }
}
