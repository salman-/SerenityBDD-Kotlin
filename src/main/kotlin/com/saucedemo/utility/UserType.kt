package org.example.com.saucedemo.utility

enum class UserType(val username: String, val password: String) {
    STANDARD_USER("standard_user", "secret_sauce"),
    LOCKED_OUT_USER("locked_out_user", "secret_sauce");
}
