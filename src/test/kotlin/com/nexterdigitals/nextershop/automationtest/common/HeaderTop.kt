package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object HeaderTop {
    val USER_PROFILE_ICON: Target = Target.the("user profile icon").located(By.cssSelector(".p-l-18"))
}
