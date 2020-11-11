package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object PaymentPage {
    val INTERNET_BANKING_TAB: Target = Target
        .the("internet banking tab")
        .located(By.cssSelector("#menu-internet-banking"))
    val BAY: Target = Target
        .the("BAY")
        .located(By.xpath("//label[text() = 'BAY']/../../.."))
    val PAY_WITH_INTERNET_BANKING_BUTTON: Target = Target
        .the("internet_banking payment_button")
        .located(By.cssSelector("#internet-pyment"))
}
