package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Post extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js_a8\"]/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div")
    WebElement post;
    @FindBy(xpath = "//*[@name='xhpc_message_text']")
    WebElement textBox;
    @FindBy(xpath = "//*[@id='u_0_1a']/div/div[6]/div/ul/li[2]/button")
    WebElement clickPost;

    public void writePost() throws InterruptedException {
        textBox.click();
        textBox.sendKeys("Testing using Name not ID.Selenium is easy.");
        sleepFor(2);
    }
    public void clickPost(){
        clickPost.click();
    }
}
