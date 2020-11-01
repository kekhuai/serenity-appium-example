package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object DailyPopup {
    val CLOSE_BUTTON: Target = Target.the("pop up close button").located(By.cssSelector("body > div:nth-child(13) > div > div > button"))
}
