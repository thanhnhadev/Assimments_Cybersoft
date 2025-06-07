package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver _driver;
    @BeforeMethod
    public void setUp(){
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
        //set time wait
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //delte all cookies
        _driver.manage().deleteAllCookies();
        _driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void waiting(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterMethod
    public void tearDown(){
        this.waiting();
        _driver.quit();
    }
}
