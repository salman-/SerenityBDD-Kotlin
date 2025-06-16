package com.saucedemo

import net.serenitybdd.annotations.Managed
import net.serenitybdd.annotations.Steps
import net.serenitybdd.core.Serenity
import net.serenitybdd.junit5.SerenityJUnit5Extension
import org.example.com.saucedemo.actions.AuthenticationActions
import org.example.com.saucedemo.pages.LoginPage
import org.example.com.saucedemo.utility.UserType
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.WebDriver

@ExtendWith(SerenityJUnit5Extension::class)
class WhenAuthenticateTest {

    @Managed
    lateinit var driver: WebDriver

    @Steps
    lateinit var authenticationActions: AuthenticationActions

    lateinit var loginPage: LoginPage

    @Test
    fun userCanLogOnAndLogOut() {
        authenticationActions.login("https://www.saucedemo.com/", UserType.STANDARD_USER)

        Serenity.reportThat("Title of the page should be Products") {
            assertTrue(loginPage.getPageTitle().contains("Products"))
        }

        authenticationActions.logout()
    }
}
