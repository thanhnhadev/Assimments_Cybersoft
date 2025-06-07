package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Scripts;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Locator.Locator_CMS;
import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Base.TestBase;
import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Page.LoginPage;
import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Page.PimPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderFlowTest extends TestBase {
    LoginPage loginPage;
    PimPage pimPage;
    @Test
    public void verifyLoginSucessFully(){
        LoginPage loginPage= new LoginPage(this._driver);
        loginPage.login(Locator_CMS.UserNameUser,Locator_CMS.PassWordUser);
    }
    @Test
    public void verifyPimSucessFully(){
        loginPage = new LoginPage(_driver);
        pimPage = new PimPage(_driver);

    }
}
