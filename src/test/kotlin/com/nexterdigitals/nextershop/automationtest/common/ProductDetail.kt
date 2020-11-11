package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object ProductDetail {
    val ADD_TO_CART_BUTTON: Target = Target
        .the("add to cart button")
        .located(By.cssSelector("#addCartBtn"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
    val CHECK_THE_STOCK_BUTTON: Target = Target
        .the("check the stock button")
        .located(By.cssSelector("#editAddress"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
