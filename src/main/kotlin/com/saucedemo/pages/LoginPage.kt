package org.example.com.saucedemo.pages


import net.serenitybdd.core.annotations.findby.FindBy
import net.serenitybdd.core.pages.PageObject
import net.serenitybdd.core.pages.WebElementFacade

class LoginPage : PageObject() {

    @FindBy(css = ".title")
    private lateinit var pageTitle: WebElementFacade

    @FindBy(id = "user-name")
    private lateinit var userNameInput: WebElementFacade

    @FindBy(id = "password")
    private lateinit var passwordInput: WebElementFacade

    @FindBy(id = "login-button")
    private lateinit var loginButton: WebElementFacade

    fun getPageTitle(): String {
        return pageTitle.text
    }

    fun clickLoginButton() {
        loginButton.click()
    }

    fun insertPassword(password: String) {
        passwordInput.sendKeys(password)
    }

    fun insertUsername(username: String) {
        userNameInput.sendKeys(username)
    }
}
