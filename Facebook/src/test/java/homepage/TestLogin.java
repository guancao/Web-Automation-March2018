package homepage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import sun.rmi.runtime.Log;

import java.awt.print.Pageable;

public class TestLogin extends Login {

    @Test
    public void test1() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        // create object using page factory
        Home home = PageFactory.initElements(driver, Home.class);
        Login login = PageFactory.initElements(driver, Login.class);
        Post post = PageFactory.initElements(driver, Post.class);

        home.clickLoginLink();

        login.enterEmail();
        login.enterPass();
        login.clickLoginBtn();

        post.writePost();
        post.clickPost();
    }

}
