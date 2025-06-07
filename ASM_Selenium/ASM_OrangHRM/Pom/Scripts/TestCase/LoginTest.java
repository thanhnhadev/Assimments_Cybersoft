package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Scripts.TestCase;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Page.LoginPage;
import org.testng.annotations.Test;

public class LoginTest {
        LoginPage loginPage;
        @Test
    public void verifyLoginSucessfulluy(){
            loginPage = new LoginPage(loginPage._driver);
        }
}
