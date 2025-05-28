package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.TestNG;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Locator.Locator_CMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class OrderFlowTest {
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
    @Test(priority = 1)
    public void verifyLoginPage(){
        driver.findElement(By.xpath(Locator_CMS.inputUserName)).sendKeys(Locator_CMS.UserNameUser);
        driver.findElement(By.xpath(Locator_CMS.inputPassWord)).sendKeys(Locator_CMS.PassWordUser);
        driver.findElement(By.xpath(Locator_CMS.btnLogin)).click();
        // In thông báo
        System.out.println("Login thành công.");
    }
    @Test(priority = 2)
    public void verifyPageAdmin() {
        this.verifyLoginPage();
        driver.findElement(By.xpath(Locator_CMS.itemAdmin)).click();
        driver.findElement(By.xpath(Locator_CMS.ad_userName)).sendKeys("ABC");
        driver.findElement(By.xpath(Locator_CMS.droDownUserRole)).click();
        driver.findElement(By.xpath(Locator_CMS.sp_dDuerRole)).click();
        driver.findElement(By.xpath(Locator_CMS.ad_empName)).sendKeys("xyz");
        driver.findElement(By.xpath(Locator_CMS.ad_sTatus)).click();
        driver.findElement(By.xpath(Locator_CMS.ad_enaBled)).click();
        driver.findElement(By.xpath(Locator_CMS.btnSearch)).click();
        // In thông báo
        System.out.println("Đã nhập thông tin tìm kiếm thành công trong Admin.");
    }
    @Test(priority = 3)
    public void verifyPagePim(){
        this.verifyLoginPage();
        driver.findElement(By.xpath(Locator_CMS.itemPim)).click();
        driver.findElement(By.xpath(Locator_CMS.emPloyeeList)).click();
        driver.findElement(By.xpath(Locator_CMS.inputEmplyessName)).sendKeys("Admin");
        driver.findElement(By.xpath(Locator_CMS.inputEmplyessid)).sendKeys("0465");
        driver.findElement(By.xpath(Locator_CMS.dropDownEmplyessStatus)).click();
        driver.findElement(By.xpath(Locator_CMS.lbFreelance)).click();
        driver.findElement(By.xpath(Locator_CMS.dropDownInclude)).click();
        driver.findElement(By.xpath(Locator_CMS.lbCurrent)).click();
        driver.findElement(By.xpath(Locator_CMS.inputSupervisor)).sendKeys("Admin  Admin123");
        driver.findElement(By.xpath(Locator_CMS.dropDownJobTitle)).click();
        driver.findElement(By.xpath(Locator_CMS.lbAutomation)).click();
        driver.findElement(By.xpath(Locator_CMS.dropDownSubUnit)).click();
        driver.findElement(By.xpath(Locator_CMS.lbOHRM)).click();
        driver.findElement(By.xpath(Locator_CMS.btnSearch)).click();
        // In thông báo
        System.out.println("Đã nhập thông tin tìm kiếm thành công trong PIM.");
    }
    @Test(priority = 4)
    public void verifyPageLeave() {
        this.verifyLoginPage();
        driver.findElement(By.xpath(Locator_CMS.itemLeave)).click();
//        driver.findElement(By.xpath(Locator_CMS.leaveList)).click();
        // In thông báo
        System.out.println("Đã nhập thông tin tìm kiếm thành công trong Leave.");
    }
    @AfterMethod
    public void oneTimetearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
