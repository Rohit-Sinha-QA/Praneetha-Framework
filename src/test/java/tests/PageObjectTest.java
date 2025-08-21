package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import page.LoginPage;

public class PageObjectTest extends BaseTest {

    @Test
    public void Verify_user_is_able_to_login(){
        LoginPage login = new LoginPage(driver);

        login.enterUsername();
        login.enterPassword();
        login.clickSubmit();
    }
}
