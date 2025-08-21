package actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class ActionHelper {

    WebDriver driver;

    public ActionHelper(WebDriver driver){
        this.driver = driver;
    }

    public void type(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void selectFromDropdown(By locator, String text){
        Select ele = new Select(driver.findElement(locator));
        ele.selectByVisibleText(text);
    }

    public void takeScreenshot() throws IOException {
        File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File("C:\\Users\\DELL\\Downloads\\Praneetha-Framework\\src\\test\\java\\screenshots\\dashboard.jpeg"));
    }
}
