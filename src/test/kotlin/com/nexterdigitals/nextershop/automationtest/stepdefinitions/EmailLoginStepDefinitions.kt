package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import com.nexterdigitals.nextershop.automationtest.login.Click
import com.nexterdigitals.nextershop.automationtest.login.FillIn
import com.nexterdigitals.nextershop.automationtest.login.UserProfile
import com.nexterdigitals.nextershop.automationtest.navigation.NavigateTo
import io.cucumber.java.Before
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast
import net.serenitybdd.screenplay.ensure.that
import net.serenitybdd.screenplay.ensure.web.ElementLocated
import net.serenitybdd.screenplay.ensure.web.TargetEnsure
import net.serenitybdd.screenplay.targets.Target

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
        actor.attemptsTo(FillIn.anEmailAs(email))
    }

    @When("{actor} enters a password as {string}")
    fun enterAPasswordAs(actor: Actor, password: String) {
        actor.attemptsTo(FillIn.aPasswordAs(password))
    }

    @When("{actor} clicks the submit button")
    fun clickTheSubmitButton(actor: Actor) {
        actor.attemptsTo(Click.submitButton())
    }

    @Then("{actor} should be logged in")
    fun shouldBeLoggedInAs(actor: Actor) {
        actor.attemptsTo(
            NavigateTo.theNextershopLoginPage(),
            TargetEnsure(Target.the("sign out menu").located(UserProfile.SIGN_OUT)).isDisplayed()
        )
    }
}
