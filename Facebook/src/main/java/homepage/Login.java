package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends CommonAPI {
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "pass")
    WebElement pass;
    @FindBy(id = "loginbutton")
    WebElement loginBtn;

    public void enterEmail(){
        email.sendKeys("bmaya2013@gmail.com");
    }
    public void enterPass(){
        pass.sendKeys("abc123@");
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
}
