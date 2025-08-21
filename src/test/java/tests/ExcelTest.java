package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ExcelUtils;
import java.io.IOException;

public class ExcelTest extends BaseTest {

    @Test
    public void verify_user_is_able_to_login() throws IOException, InterruptedException {
        ActionHelper action = new ActionHelper(driver);

        ExcelUtils.setExcelFile("C:\\Users\\DELL\\Downloads\\Praneetha-Framework\\src\\test\\java\\data\\TestData.xlsx", "Sheet1");

        action.type(By.id("user"), ExcelUtils.getCellData(1, 0));
        action.type(By.id("pass"), ExcelUtils.getCellData(1, 1));
        action.click(By.xpath("//button[@type='submit']"));

        Assert.assertEquals("https://rohit-automation.netlify.app/dashboard/dashboard.html", driver.getCurrentUrl());
    }
}
