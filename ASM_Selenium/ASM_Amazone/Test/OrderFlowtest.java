package AutomationTest.CyberSoft.Selenium.ASM_Amazone.Test;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Locator.Locator_CMS;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderFlowtest {
    private static WebDriver driver;
    @BeforeMethod
    public void seUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        //set time wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //delte all cookies
        driver.manage().deleteAllCookies();
        //open url
        driver.get(Locator_CMS.base_URL);
        this.testScrollPage();
    }
    public void testScrollPage(){
        Actions ac = new Actions(driver);
        // Scroll down
        ac.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        // Scroll up
        ac.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
    }
    @Test
    public void HomePage(){

    }

    @AfterMethod
    public void oneTimetearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
