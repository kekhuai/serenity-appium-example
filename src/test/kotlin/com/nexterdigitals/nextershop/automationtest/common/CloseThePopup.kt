package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task

open class CloseThePopup : Task {
    override fun <T : Actor?> performAs(actor: T) {
        actor?.wasAbleTo(Close.thePopup())
    }
}
