package com.nexterdigitals.nextershop.automationtest.login

import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Clear
import net.serenitybdd.screenplay.actions.Enter

object FillIn {
    fun anEmailAs(email: String): Performable {
        return Task.where(
            "{0} tries to enter an email as #email",
            Clear.field(LoginForm.EMAIL_FIELD),
            Enter.theValue(email).into(LoginForm.EMAIL_FIELD)
        ).with("email").of(email)
    }
    fun aPasswordAs(password: String): Performable {
        return Task.where(
            "{0} tries to enter a password as #password",
            Clear.field(LoginForm.PASSWORD_FIELD),
            Enter.theValue(password).into(LoginForm.PASSWORD_FIELD)
        ).with("password").of(password)
    }
}
