package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object ThankYouPage {
    val THANK_YOU_MESSAGE: Target = Target
        .the("thank you message")
        .located(By.cssSelector(".thank-title"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
