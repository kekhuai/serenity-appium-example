package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object DailyPopup {
    val CLOSE_BUTTON: Target = Target
        .the("pop up close button")
        .located(By.cssSelector("button.styles_closeButton__20ID4"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
