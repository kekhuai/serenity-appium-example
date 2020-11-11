package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object ConfirmPaymentPopup {
    val CONFIRM_BUTTON: Target = Target
        .the("confirm payment button")
        .located(By.xpath("(//button[text() = 'ชำระเงิน'])[2]"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
