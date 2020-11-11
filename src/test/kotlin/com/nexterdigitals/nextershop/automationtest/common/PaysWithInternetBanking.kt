package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.actions.Click

open class PaysWithInternetBanking : Performable {
    override fun <T : Actor?> performAs(actor: T) {
        actor?.attemptsTo(
            Click.on(PaymentPage.INTERNET_BANKING_TAB),
            Click.on(PaymentPage.BAY),
            Click.on(PaymentPage.PAY_WITH_INTERNET_BANKING_BUTTON),
            Click.on(OmisePage.SUCCESS_BUTTON)
        )
    }
}
