package AutomationTest.CyberSoft.Selenium.ASM_SwagLabs.TestNg;

import AutomationTest.CyberSoft.Selenium.ASM_SwagLabs.Locator.Locator_CMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        testChoi();
    }

    public static void testChoi() throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        //set time wait
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(15));
        //delte all cookies
        driver.manage().deleteAllCookies();
        //open url
        driver.get(Locator_CMS.base_URL);
        //login to systems
        driver.findElement(By.xpath(Locator_CMS.inputUserName)).sendKeys(Locator_CMS.UserNameUser);
        driver.findElement(By.xpath(Locator_CMS.inputPassWord)).sendKeys(Locator_CMS.PassWordUser);
        driver.findElement(By.xpath(Locator_CMS.btnLogin)).click();
        Thread.sleep(2000);
        //select first Product
        driver.findElement(By.xpath(Locator_CMS.lblFirstProductXpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Locator_CMS.btnFirstProductXpath)).click();
        Thread.sleep(2000);
        //navigate to cart
        driver.findElement(By.xpath(Locator_CMS.btnShoppingCardXpath)).click();
        Thread.sleep(2000);
        List<WebElement> cartItem = driver.findElements(By.className("cart_item"));
        if(cartItem.size()>0){
            System.out.println("add to card successfully");
            driver.findElement(By.xpath(Locator_CMS.btnCheckout)).click();
            driver.findElement(By.xpath(Locator_CMS.inputFirsName)).sendKeys(Locator_CMS.nameFirsName);
            driver.findElement(By.xpath(Locator_CMS.inputLastName)).sendKeys(Locator_CMS.nameLastName);
            driver.findElement(By.xpath(Locator_CMS.inputPostalCode)).sendKeys(Locator_CMS.namePostalCode);
            driver.findElement(By.xpath(Locator_CMS.btnContinue)).click();
            driver.findElement(By.xpath(Locator_CMS.btnFinish)).click();
            driver.findElement(By.xpath(Locator_CMS.btnBackHome)).click();
            driver.findElement(By.xpath(Locator_CMS.btnHbOpenMenu)).click();
            driver.findElement(By.xpath(Locator_CMS.iTemLogout)).click();
        }
        else{
            System.out.println("add to card failed");
            driver.findElement(By.xpath(Locator_CMS.btnContinueShopping)).click();
            System.out.println("go to page Shopping");
            driver.findElement(By.xpath(Locator_CMS.btnHbOpenMenu)).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(Locator_CMS.iTemLogout)).click();
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
