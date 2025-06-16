package com.saucedemo

import net.serenitybdd.annotations.Managed
import net.serenitybdd.annotations.Steps
import net.serenitybdd.core.Serenity
import net.serenitybdd.junit5.SerenityJUnit5Extension
import org.example.com.saucedemo.actions.LoginActions
import org.example.com.saucedemo.pages.LoginPage
import org.example.com.saucedemo.utility.UserType
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.WebDriver

@ExtendWith(SerenityJUnit5Extension::class)
class WhenLoginOnTest {

    @Managed
    lateinit var driver: WebDriver

    @Steps
    lateinit var loginActions: LoginActions

    lateinit var loginPage: LoginPage

    @Test
    fun userCanLogOnViaHomePage() {
        loginActions.login("https://www.saucedemo.com/", UserType.STANDARD_USER)

        Serenity.reportThat("Title of the page should be Products") {
            assertTrue(loginPage.getPageTitle().contains("Products"))
        }
    }
}
