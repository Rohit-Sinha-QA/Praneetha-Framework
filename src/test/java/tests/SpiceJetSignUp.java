package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SpiceJetSignUp extends BaseTest {

    //@Test
    public void verify_user_is_able_to_signup() throws InterruptedException {
        ActionHelper action = new ActionHelper(driver);

        action.type(By.id("first_name"), "Rohit");
        action.type(By.id("last_name"), "Sinha");
        action.selectFromDropdown(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/select"), "Guam");
        Thread.sleep(5000);
    }
}
