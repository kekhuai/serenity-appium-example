package com.nexterdigitals.nextershop.automationtest.navigation

import net.serenitybdd.core.annotations.findby.By
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Open
import net.serenitybdd.screenplay.targets.Target

object NavigateTo {
    fun theNextershopHomePage(): Performable {
        return Task.where("{0} opens the Nextershop home page", Open.browserOn().the(NextershopHomePage::class.java))
    }

    fun theNextershopLoginPage(): Performable {
        val signInNavItem = Target.the("Sign in nav item").located(By.cssSelector("#header-top > div > ul > li.nav-item.menu-signin.d-none.d-lg-flex"))
        val signInDropDownItem = Target.the("Sign in drop down item").located(By.cssSelector("#header-top > div > ul > li.nav-item.menu-signin.d-none.d-lg-flex > div > div > button:nth-child(1)"))
        return Task.where(
            "{0} goes to login page",
            Click.on(signInNavItem),
            Click.on(signInDropDownItem)
        )
    }
}
