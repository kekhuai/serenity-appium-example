package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import java.time.Duration

object Accept {
    fun allCookies(): Performable {
        return Task.where(
            "{0} tries to accept all cookies",
            Click.on(OneTrust.ACCEPT_ALL_BUTTON.waitingForNoMoreThan(Duration.ofMinutes(1)))
        )
    }
}
