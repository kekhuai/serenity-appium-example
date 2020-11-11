package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object CartPage {
    val ADD_SHIPPING_ADDRESS_BUTTON: Target = Target
        .the("add shipping address button")
        .located(By.xpath("(//div[text() = 'เพิ่ม'])[1]"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
    val PAY_BUTTON: Target = Target
        .the("pay button")
        .located(By.cssSelector("#NextBtn"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
