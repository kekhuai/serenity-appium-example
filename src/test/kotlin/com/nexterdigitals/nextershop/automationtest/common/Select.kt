package com.nexterdigitals.nextershop.automationtest.common

import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Scroll
import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By
import java.time.Duration

object Select {
    fun theProductMenu(): Performable {
        return Task.where(
            "{0} tries to select products dropdown menu",
            Click.on(HeaderMiddle.PRODUCT_MENU)
        )
    }

    fun theProductCategory(category: String): Performable {
        val locator: Target = Target
            .the("product category")
            .located(By.xpath("//a[text() = '$category']"))
        return Task.where(
            "{0} tries to select #category category",
            Click.on(locator)
        )
    }

    fun theProductSubCategory(subCategory: String): Performable {
        val locator: Target = Target
            .the("product sub-category")
            .located(By.xpath("//div[@id='item-C1000036']/a[text() = '$subCategory']"))
        return Task.where(
            "{0} tries to select #subCategory sub-category",
            Click.on(locator)
        )
    }

    fun theProduct(product: String): Performable {
        val locator: Target = Target
            .the("product")
            .located(By.xpath("//p[text() = '$product']/.."))
            .waitingForNoMoreThan(Duration.ofMinutes(1))
        return Task.where(
            "{0} tries to select #product",
            Scroll.to(locator).andAlignToBottom(),
            Click.on(locator)
        )
    }

    fun province(province: String): Performable {
        val locator: Target = Target
            .the("province")
            .located(By.xpath("//div[text() = '$province']"))
            .waitingForNoMoreThan(Duration.ofMinutes(1))
        return Task.where(
            "{0} tries to select #province province",
            Click.on(locator)
        )
    }

    fun district(district: String): Performable {
        val locator: Target = Target
            .the("district")
            .located(By.xpath("//div[text() = '$district']"))
            .waitingForNoMoreThan(Duration.ofMinutes(1))
        return Task.where(
            "{0} tries to select #district district",
            Click.on(locator)
        )
    }

    fun subDistrict(subDistrict: String): Performable {
        val locator: Target = Target
            .the("subDistrict")
            .located(By.xpath("//div[text() = '$subDistrict']"))
            .waitingForNoMoreThan(Duration.ofMinutes(1))
        return Task.where(
            "{0} tries to select #subDistrict sub-district",
            Click.on(locator)
        )
    }

    fun postCode(postCode: String): Performable {
        val locator: Target = Target
            .the("postCode")
            .located(By.xpath("//div[text() = '$postCode']"))
            .waitingForNoMoreThan(Duration.ofMinutes(1))
        return Task.where(
            "{0} tries to select #postCode post code",
            Click.on(locator)
        )
    }

    fun theFirstShippingAddress(): Performable {
        return Task.where(
            "{0} tries to select the first shipping address",
            Click.on(CartPage.ADD_SHIPPING_ADDRESS_BUTTON),
            Click.on(ChangeShippingAddressPopup.CONFIRM_BUTTON)
        )
    }
}
