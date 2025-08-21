package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By username = By.id("user");
    By password = By.id("pass");
    By submit = By.xpath("//button[@type='submit']");



    public void enterUsername(){
        driver.findElement(username).sendKeys("admin");
    }

    public void enterPassword(){
        driver.findElement(password).sendKeys("admin@1234");
    }

    public void clickSubmit(){
        driver.findElement(submit).click();
    }
}
