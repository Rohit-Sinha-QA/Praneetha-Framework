package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.testng.annotations.Test;
import java.io.IOException;

public class ScreenshotTest extends BaseTest {

    @Test
    public void verify_user_is_able_to_take_screenshot() throws IOException {
        ActionHelper action = new ActionHelper(driver);

        action.takeScreenshot();
    }
}
