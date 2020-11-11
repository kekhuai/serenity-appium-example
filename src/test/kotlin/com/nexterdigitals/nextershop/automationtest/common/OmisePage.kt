package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object OmisePage {
    val SUCCESS_BUTTON: Target = Target
        .the("success button")
        .located(By.xpath("//a[text() = 'Success']"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
