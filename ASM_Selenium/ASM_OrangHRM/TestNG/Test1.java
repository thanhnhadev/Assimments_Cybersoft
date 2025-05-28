package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.TestNG;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Locator.Locator_CMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Test1 {

    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        //set time wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //delte all cookies
        driver.manage().deleteAllCookies();
        //open url
        driver.get(Locator_CMS.base_URL);
        //login to systems
        driver.findElement(By.xpath(Locator_CMS.inputUserName)).sendKeys(Locator_CMS.UserNameUser);
        driver.findElement(By.xpath(Locator_CMS.inputPassWord)).sendKeys(Locator_CMS.PassWordUser);
        driver.findElement(By.xpath(Locator_CMS.btnLogin)).click();
        //HomePage
        driver.findElement(By.xpath(Locator_CMS.itemPim)).click();
        driver.findElement(By.xpath(Locator_CMS.emPloyeeList)).click();
        driver.findElement(By.xpath(Locator_CMS.dropDownEmplyessStatus)).click();
        driver.findElement(By.xpath(Locator_CMS.lbFreelance)).click();
        driver.findElement(By.xpath(Locator_CMS.dropDownInclude)).click();
        driver.findElement(By.xpath(Locator_CMS.lbCurrent)).click();
        driver.findElement(By.xpath(Locator_CMS.dropDownJobTitle)).click();
        driver.findElement(By.xpath(Locator_CMS.lbAutomation)).click();
        //driver.findElement(By.xpath(Locator_CMS.dropDownSubUnit)).click();
        driver.findElement(By.xpath(Locator_CMS.lbOHRM)).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
