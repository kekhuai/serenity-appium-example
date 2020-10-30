package com.nexterdigitals.nextershop.automationtest.login

import org.openqa.selenium.By

internal object LoginForm {
    val TITLE: By = By.cssSelector(".title")
    val EMAIL_FIELD: By = By.cssSelector("#email")
    val PASSWORD_FIELD: By = By.cssSelector("#password")
    val SUBMIT_BUTTON: By = By.cssSelector("button[name=submit]")
}
