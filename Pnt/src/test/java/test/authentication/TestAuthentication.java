package test.authentication;

import authentication.LogInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestAuthentication extends CommonAPI{

    @Test
    public void logIn()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToPntForum(driver);
    }

}
