package authentication;

import authentication.popup.HandlePopUp;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.ArrayList;

public class LogInPage {

    @FindBy(css = "#globl-cont a")
    public WebElement loginButtonElement;

    @FindBy(css = ".input_text")
    public WebElement userNameInputField;

    @FindBy(css = ".input_password")
    public WebElement passwordInputField;

    @FindBy(css = ".button_submit")
    public WebElement clickButtonElement;

    public WebElement getClickButtonElement() {
        return clickButtonElement;
    }

    public void setClickButtonElement(WebElement clickButtonElement) {
        this.clickButtonElement = clickButtonElement;
    }

    public WebElement getUserNameInputField() {
        return userNameInputField;
    }

    public void setUserNameInputField(WebElement userNameInputField) {
        this.userNameInputField = userNameInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public void setPasswordInputField(WebElement passwordInputField) {
        this.passwordInputField = passwordInputField;
    }

    public WebElement getLoginButtonElement() {
        return loginButtonElement;
    }

    public void setLoginButtonElement(WebElement loginButtonElement) {
        this.loginButtonElement = loginButtonElement;
    }

    public void clickOnLogInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLoginButtonElement().click();
    }
    public void typeUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getUserNameInputField().sendKeys("testuser1");
    }
    public void typePassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPasswordInputField().sendKeys("abcd1234");
    }
    public void clickOnAuthenticate(){
        getClickButtonElement().click();
    }

    public void logInToPntForum(WebDriver driver1)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HandlePopUp handlePopUp = PageFactory.initElements(driver1, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogIn(driver1);
        CommonAPI.sleepFor(2);
        clickOnLogInButton();
        CommonAPI.handleNewTab(driver1);
        typeUserName();
        typePassword();
        clickOnAuthenticate();
    }
}
