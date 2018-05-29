package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends CommonAPI {
    @FindBy(xpath = "//a[text()='Log In']")
    WebElement loginLink;

    public void clickLoginLink(){
        loginLink.click();
    }


}
