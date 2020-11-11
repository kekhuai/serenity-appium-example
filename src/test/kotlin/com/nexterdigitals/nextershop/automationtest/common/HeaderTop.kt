package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object HeaderTop {
    val CART_ICON: Target = Target
        .the("cart icon")
        .located(By.cssSelector(".nav-item>.fa-shopping-cart"))
}
