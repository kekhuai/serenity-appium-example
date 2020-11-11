package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object ShippingAddressModal {
    val FIRST_SHIPPING_ADDRESS: Target = Target
        .the("first shipping address")
        .located(By.cssSelector("#address-list-39"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
    val CONFIRM_BUTTON: Target = Target
        .the("confirm address button")
        .located(By.xpath("//button[text() = 'บันทึก']"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
