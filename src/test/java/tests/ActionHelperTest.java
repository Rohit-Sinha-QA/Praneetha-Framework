package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActionHelperTest extends BaseTest {

    @Test
    public void Verify_user_is_able_to_login(){
        ActionHelper action = new ActionHelper(driver);

        action.type(By.id("user"), "admin");
        action.type(By.id("pass"), "admin@1234");
        action.click(By.xpath("//button[@type='submit']"));
    }
}

// Hello
// Test
