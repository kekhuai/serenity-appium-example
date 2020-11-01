package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click

object Close {
    fun thePopup(): Performable {
        return Task.where("{0} attempts to close the popup", Click.on(DailyPopup.CLOSE_BUTTON))
    }
}
