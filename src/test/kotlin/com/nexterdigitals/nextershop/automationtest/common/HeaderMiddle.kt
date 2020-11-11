package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object HeaderMiddle {
    val USER_PROFILE_ICON: Target = Target
        .the("user profile icon")
        .located(By.cssSelector(".p-l-18"))
    val HAMBURGER_MENU: Target = Target
        .the("hamburger menu")
        .located(By.cssSelector(".p-t-10.p-r-15.p-b-10.p-l-30"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
    val PRODUCT_MENU: Target = Target
        .the("products dropdown menu")
        .located(By.cssSelector("a[href=\\#item-1]"))
        .waitingForNoMoreThan(Duration.ofMinutes(1))
}
