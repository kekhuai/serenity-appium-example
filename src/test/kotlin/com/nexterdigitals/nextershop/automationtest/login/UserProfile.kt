package com.nexterdigitals.nextershop.automationtest.login

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object UserProfile {
    val SIGN_OUT: Target = Target
        .the("sign out menu")
        .located(By.cssSelector(".user-signout"))
}
