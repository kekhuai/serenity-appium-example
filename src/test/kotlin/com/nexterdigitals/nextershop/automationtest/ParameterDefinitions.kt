package com.nexterdigitals.nextershop.automationtest

import io.cucumber.java.ParameterType
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.actors.OnStage

internal class ParameterDefinitions {
    @ParameterType(".*")
    fun actor(actorName: String?): Actor {
        return OnStage.theActorCalled(actorName)
    }
}
