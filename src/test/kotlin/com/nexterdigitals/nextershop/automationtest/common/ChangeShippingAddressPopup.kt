package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object ChangeShippingAddressPopup {
    val CONFIRM_BUTTON: Target = Target
        .the("change address button")
        .located(By.xpath("//button[text() = 'เปลี่ยนที่อยู่']"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
