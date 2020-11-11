package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click

object Open {
    fun theHamburgerMenu(): Performable {
        return Task.where(
            "{0} attempts to open the hamburger menu",
            Click.on(HeaderMiddle.HAMBURGER_MENU)
        )
    }
}
