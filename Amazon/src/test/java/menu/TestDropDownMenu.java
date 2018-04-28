package menu;

import base.CommonAPI;
import menu.page.MenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.util.List;

public class TestDropDownMenu extends MenuPage{

    @Test
    public void menu(){
      ApplicationLog.epicLogger("Browser is launched");
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      readMenuText();
    }
}
