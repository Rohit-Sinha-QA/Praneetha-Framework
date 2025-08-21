package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SimpleTest extends BaseTest {

    @Test
    public void Verify_user_is_able_to_login(){
        driver.findElement(By.id("user")).sendKeys("admin");
        driver.findElement(By.id("pass")).sendKeys("admin@1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}
