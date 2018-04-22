package test.authentication;

import authentication.popup.HandlePopUp;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestPopUpWindow extends CommonAPI {

    @Test
    public void testPopUp()throws InterruptedException{
        HandlePopUp handlePopUp = PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.closePopUpWindow(driver);
    }
}
