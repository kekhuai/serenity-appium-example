package com.nexterdigitals.nextershop.automationtest.login

import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Scroll

object Click {
    fun submitButton(): Performable {
        return Task.where(
            "{0} attempts to click the submit button",
            Click.on(LoginForm.TITLE),
            Scroll.to(LoginForm.SUBMIT_BUTTON).andAlignToTop(),
            Click.on(LoginForm.SUBMIT_BUTTON)
        )
    }
}
