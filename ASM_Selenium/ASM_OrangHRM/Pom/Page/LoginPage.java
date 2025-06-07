package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Page;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Locator.Locator_CMS;
import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BasePage {
    private WebDriverWait wait;
         // Constructor
        public LoginPage(WebDriver driver) {
            super(driver);
            wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        }
        // Elements xac dinh phan tu de dang nhap
        private By usernameField = By.xpath(Locator_CMS.inputUserName);
        private By passwordField = By.xpath(Locator_CMS.inputPassWord);
        private By loginButton = By.xpath(Locator_CMS.btnLogin);

    private void setinputUserID(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
        _driver.findElement(usernameField).sendKeys(email);
    }
    private void setPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        _driver.findElement(passwordField).sendKeys(password);
    }
    private void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        _driver.findElement(loginButton).click();
    }

    public void verifyLoginSuccsess(){
        Assert.assertFalse(_driver.getCurrentUrl().contains("authentication"),"fail van login");
    }
    // viet cho phuong thuc dang nhap
    public void loginPage(String email, String password) {
        setinputUserID(email);
        setPassword(password);
        clickLoginButton();
        this._driver.findElement(usernameField).sendKeys(email);
        this._driver.findElement(passwordField).sendKeys(password);
        this._driver.findElement(loginButton).click();
    }


}
