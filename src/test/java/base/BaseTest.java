package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUpBase(){
        driver = DriverManager.initDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownBase(){
        DriverManager.quitDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
