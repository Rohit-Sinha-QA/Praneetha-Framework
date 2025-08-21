package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.JsonUtils;

public class JsonTest extends BaseTest {

    @Test
    public void verify_user_is_able_to_login(){
        ActionHelper action = new ActionHelper(driver);

        action.type(By.id("user"), JsonUtils.get("username"));
        action.type(By.id("pass"), JsonUtils.get("password"));
        action.click(By.xpath("//button[@type='submit']"));
    }
}
