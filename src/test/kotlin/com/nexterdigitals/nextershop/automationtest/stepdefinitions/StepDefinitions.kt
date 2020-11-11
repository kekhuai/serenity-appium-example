package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import com.nexterdigitals.nextershop.automationtest.common.Close
import com.nexterdigitals.nextershop.automationtest.common.CloseThePopup
import com.nexterdigitals.nextershop.automationtest.navigation.NavigateTo
import io.cucumber.java.Before
import io.cucumber.java.en.Given
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast
import net.thucydides.core.annotations.Steps

class StepDefinitions {
//    @Steps
//    private lateinit var closeThePopup: CloseThePopup

    @Before
    fun setTheStage() {
        OnStage.setTheStage(OnlineCast())
    }

    @Given("{actor} is on the Nextershop home page")
    fun onTheNextershopHomePage(actor: Actor) {
        actor.wasAbleTo(NavigateTo.theNextershopHomePage())
    }

    @Given("{actor} tries to close the popup if there is any")
    fun closeThePopup(actor: Actor) {
        try {
            actor.wasAbleTo(Close.thePopup())
        } catch (e: Exception) {
            // explicit swallow exception
        }
    }

}
