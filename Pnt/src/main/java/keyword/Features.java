package keyword;

import authentication.LogInPage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import searchpage.SearchPage;

import java.io.IOException;

public class Features extends CommonAPI {
    LogInPage logInPage = new LogInPage();
    SearchPage searchPage = new SearchPage();
    public void signIn(){
       logInPage.typeUserName();
       logInPage.typePassword();
       logInPage.clickOnAuthenticate();
    }
    public void registration(){
        typeByCss("", "email");
        typeByCss("", "password");
    }

    public void search(WebDriver driver1) throws InterruptedException,IOException{
       searchPage.searchTopics(driver1);
    }

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "signIn":
                signIn();
                break;
            case "registration":
                registration();
                break;
            case "search":
                search(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
