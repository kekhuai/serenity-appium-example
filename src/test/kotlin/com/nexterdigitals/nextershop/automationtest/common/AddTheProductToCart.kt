package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.actions.Click

open class AddTheProductToCart : Performable {
    override fun <T : Actor?> performAs(actor: T) {
        actor?.wasAbleTo(
            Click.on(ProductDetail.ADD_TO_CART_BUTTON)
        )
    }
}
