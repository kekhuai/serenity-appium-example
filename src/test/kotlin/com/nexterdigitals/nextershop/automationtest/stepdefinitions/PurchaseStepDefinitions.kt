package com.nexterdigitals.nextershop.automationtest.stepdefinitions

import com.nexterdigitals.nextershop.automationtest.common.*
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.ensure.web.TargetEnsure
import net.thucydides.core.annotations.Steps

class PurchaseStepDefinitions {
    @Steps
    private lateinit var addTheProductToCart: AddTheProductToCart

    @Steps
    private lateinit var checkTheStock: CheckTheStock

    @Steps
    private lateinit var goesToCartPage: GoesToCartPage

    @Steps
    private lateinit var goesToPaymentPage: GoesToPaymentPage

    @Steps
    private lateinit var paysWithInternetBanking: PaysWithInternetBanking

    @Given("{actor} open the product selection dropdown")
    fun openTheProductSelectionDropdown(actor: Actor) {
        actor.wasAbleTo(Open.theHamburgerMenu(), Select.theProductMenu())
    }

    @Given("{actor} select {string} category")
    fun selectProductCategory(actor: Actor, category: String) {
        actor.wasAbleTo(Select.theProductCategory(category))
    }

    @Given("{actor} select {string} sub-category")
    fun selectProductSubCategory(actor: Actor, subCategory: String) {
        actor.wasAbleTo(Select.theProductSubCategory(subCategory))
    }

    @Given("{actor} select {string} product")
    fun selectProduct(actor: Actor, product: String) {
        actor.wasAbleTo(Select.theProduct(product))
    }

    @Given("{actor} select {string} province")
    fun selectProvince(actor: Actor, province: String) {
        actor.wasAbleTo(Select.province(province))
    }

    @Given("{actor} select {string} district")
    fun selectDistrict(actor: Actor, district: String) {
        actor.wasAbleTo(Select.district(district))
    }

    @Given("{actor} select {string} sub-district")
    fun selectSubDistrict(actor: Actor, subDistrict: String) {
        actor.wasAbleTo(Select.subDistrict(subDistrict))
    }

    @Given("{actor} select {string} post code")
    fun selectPostCode(actor: Actor, postCode: String) {
        actor.wasAbleTo(Select.postCode(postCode))
    }

    @Given("{actor} tries to check the stock")
    fun checkStock(actor: Actor) {
        actor.wasAbleTo(checkTheStock)
    }

    @Given("{actor} add the product to cart")
    fun addTheProductToCart(actor: Actor) {
        actor.wasAbleTo(addTheProductToCart)
    }

    @Given("{actor} goes to cart page")
    fun goesToCartPage(actor: Actor) {
        actor.wasAbleTo(goesToCartPage)
    }

    @Given("{actor} selects his first shipping address")
    fun selectTheFirstShippingAddress(actor: Actor) {
        actor.wasAbleTo(Select.theFirstShippingAddress())
    }

    @Given("{actor} goes to payment page")
    fun goesToPaymentPage(actor: Actor) {
        actor.wasAbleTo(goesToPaymentPage)
    }

    @When("{actor} pays with internet banking")
    fun paysWithInternetBanking(actor: Actor) {
        actor.attemptsTo(paysWithInternetBanking)
    }

    @Then("{actor} must be redirected to thank you page")
    fun mustBeRedirectedToThankYouPage(actor: Actor) {
        actor.attemptsTo(TargetEnsure(ThankYouPage.THANK_YOU_MESSAGE).isDisplayed())
    }
}
