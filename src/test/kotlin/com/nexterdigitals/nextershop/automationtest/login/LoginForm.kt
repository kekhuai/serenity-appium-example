package com.nexterdigitals.nextershop.automationtest.login

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

internal object LoginForm {
    val TITLE: Target = Target.the("login page title").located(By.cssSelector(".title"))
    val EMAIL_FIELD: Target = Target.the("email field").located(By.cssSelector("#email"))
    val PASSWORD_FIELD: Target = Target
        .the("password field")
        .located(By.cssSelector("#password"))
    val SUBMIT_BUTTON: Target = Target
        .the("submit button")
        .located(By.cssSelector("button[name=submit]"))
    val VALIDATION_MESSAGE: Target = Target
        .the("login validation message")
        .located(By.cssSelector(".needs-validation>div:first-child>.invalid-feedback"))
}
