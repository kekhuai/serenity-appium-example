package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.actions.Click

open class GoesToCartPage : Performable {
    override fun <T : Actor?> performAs(actor: T) {
        actor?.wasAbleTo(Click.on(HeaderTop.CART_ICON))
    }
}
