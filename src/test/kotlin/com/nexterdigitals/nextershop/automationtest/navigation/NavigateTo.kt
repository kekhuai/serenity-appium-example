package com.nexterdigitals.nextershop.automationtest.navigation

import com.nexterdigitals.nextershop.automationtest.common.HeaderMiddle
import com.nexterdigitals.nextershop.automationtest.common.OneTrust
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Open
import java.time.Duration

object NavigateTo {
    fun theNextershopHomePage(): Performable {
        return Task.where(
            "{0} opens the Nextershop home page",
            Open.browserOn().the(NextershopHomePage::class.java),
            Click.on(OneTrust.ACCEPT_ALL_BUTTON.waitingForNoMoreThan(Duration.ofMinutes(1)))
        )
    }

    fun theNextershopLoginPage(): Performable {
        return Task.where(
            "{0} goes to login page",
            Click.on(HeaderMiddle.USER_PROFILE_ICON)
        )
    }
}
