package pages

import geb.Page

class ZapierPage extends Page {
    static url = 'https://zapier.com/'
    static at = { singUpForm.isDisplayed() }
    static content = {
        singUpForm (wait: true) { $('.signup-form') }
        firstNameInput { $('input[name="first_name"]') }
        lastNameInput { $('input[name="last_name"]') }
        emailInput { $('input[name="email"]') }
        passwordInput { $('input[name="password"]') }
        singUpButton { $('button[type="submit"]') }

        zapierLogo { $('.header__logo') }
    }
}
