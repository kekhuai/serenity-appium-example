package com.nexterdigitals.nextershop.automationtest.login

import org.openqa.selenium.By

internal object LoginForm {
    val EMAIL_FIELD: By = By.id("email")
    val PASSWORD_FIELD: By = By.id("password")
    val SUBMIT_BUTTON: By = By.name("submit")
}
