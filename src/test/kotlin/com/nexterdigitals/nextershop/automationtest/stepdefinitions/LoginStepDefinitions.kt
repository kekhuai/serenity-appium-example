package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import com.nexterdigitals.nextershop.automationtest.login.Click
import com.nexterdigitals.nextershop.automationtest.login.FillIn
import com.nexterdigitals.nextershop.automationtest.login.LoginForm
import com.nexterdigitals.nextershop.automationtest.login.UserProfile
import com.nexterdigitals.nextershop.automationtest.navigation.NavigateTo
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.ensure.web.TargetEnsure
import java.time.Duration

class LoginStepDefinitions {
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
            TargetEnsure(UserProfile.SIGN_OUT).isDisplayed()
        )
    }

    @Then("{actor} should not be logged in")
    fun shouldNotBeLoggedIn(actor: Actor) {
        actor.attemptsTo(
            TargetEnsure(LoginForm.VALIDATION_MESSAGE.waitingForNoMoreThan(Duration.ofMinutes(1))).hasText("อีเมลหรือรหัสผ่านไม่ถูกต้อง โปรดลองอีกครั้ง")
        )
    }
}
