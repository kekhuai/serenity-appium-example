package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object OneTrust {
    val ACCEPT_ALL_BUTTON: Target = Target
        .the("OneTrust accept all button")
        .located(By.cssSelector("button#onetrust-accept-btn-handler"))
}
