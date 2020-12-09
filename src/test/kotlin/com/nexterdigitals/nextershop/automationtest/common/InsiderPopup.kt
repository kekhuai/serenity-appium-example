package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object InsiderPopup {
    val CLOSE_BUTTON: Target = Target
        .the("close button")
        .located(By.xpath("//div[contains(@id, 'wrap-close-button')]"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
