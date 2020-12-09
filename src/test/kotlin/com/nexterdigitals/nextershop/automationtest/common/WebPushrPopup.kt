package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object WebPushrPopup {
    val CLOSE_BUTTON: Target = Target.the("close button")
        .located(By.cssSelector("#webpushr-deny-button"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
