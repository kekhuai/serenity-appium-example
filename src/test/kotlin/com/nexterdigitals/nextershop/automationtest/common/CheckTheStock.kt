package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click

open class CheckTheStock : Task {
    override fun <T : Actor?> performAs(actor: T) {
        actor?.wasAbleTo(
            Click.on(ProductDetail.CHECK_THE_STOCK_BUTTON),
            Click.on(ShippingAddressModal.FIRST_SHIPPING_ADDRESS),
            Click.on(ShippingAddressModal.CONFIRM_BUTTON)
        )
    }
}
