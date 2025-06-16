package org.example.com.saucedemo.actions

import net.serenitybdd.annotations.Step
import net.serenitybdd.core.steps.UIInteractionSteps
import org.example.com.saucedemo.pages.LoginPage
import org.example.com.saucedemo.utility.UserType

open class AuthenticationActions : UIInteractionSteps() {

    private val loginPage: LoginPage = LoginPage()

    @Step("Login as {1}")
    fun login(url: String, user: UserType) {
        openUrl(url)
        loginPage.insertUsername(user.username)
        loginPage.insertPassword(user.password)
        loginPage.clickLoginButton()
    }

    @Step("Log out")
    fun logout() {
        loginPage.openMenu()
        loginPage.clickOnLogOut()
    }
}
