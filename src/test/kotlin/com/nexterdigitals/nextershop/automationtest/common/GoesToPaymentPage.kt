package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Scroll
import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

open class GoesToPaymentPage : Performable {
    override fun <T : Actor?> performAs(actor: T) {
        actor?.wasAbleTo(
            Scroll.to(Target.the("payment summary").located(By.xpath("//div[text() = 'ราคาสินค้ารวมค่าขนส่ง']")).waitingForNoMoreThan(
                Duration.ofMinutes(1))),
            Click.on(CartPage.PAY_BUTTON),
            Click.on(ConfirmPaymentPopup.CONFIRM_BUTTON)
        )
    }
}
