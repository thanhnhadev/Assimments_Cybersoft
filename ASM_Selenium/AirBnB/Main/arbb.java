package AutomationTest.CyberSoft.Selenium.AirBnB.Main;
import AutomationTest.CyberSoft.Selenium.AirBnB.Locator.Locator_CMS;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
public class arbb {
    private static WebDriver driver;

    @BeforeMethod
    public void seUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        //set time wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
        //delte all cookies
        driver.manage().deleteAllCookies();
    }

    public void waiting(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
   @Test
    public void HomePage() {
        //open url
        driver.get(Locator_CMS.base_URL);
        driver.findElement(By.xpath(Locator_CMS.pLocation)).click();
        driver.findElement(By.xpath(Locator_CMS.lbHCM)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Mở lịch
        driver.findElement(By.xpath(Locator_CMS.openDatepicker)).click();
// B1: Tìm phần tử
        WebElement hoChiMinh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator_CMS.lbHCM)));
// B2: Scroll vào vùng nhìn thấy
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", hoChiMinh);
       // Chờ thêm chút để ổn định
// B3: Click bằng JavaScript (chắc ăn khi bị overlay)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hoChiMinh);
        // Chọn ngày đi
        driver.findElement(By.xpath(Locator_CMS.lbDateGo)).click();
        // Chọn ngày về
        driver.findElement(By.xpath(Locator_CMS.lbDateBack)).click();
        //Chon so khach
        driver.findElement(By.xpath(Locator_CMS.lbCustomer)).click();
        driver.findElement(By.xpath(Locator_CMS.lbPush)).click();
        driver.findElement(By.xpath(Locator_CMS.search)).click();
        System.out.println("search thanh cong");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'py-12 space-y-3 h-auto')]")));
        System.out.println("trang kết quả đã được tải.");
        List<WebElement> rooms = driver.findElements(By.xpath("//div[contains(@class, 'py-12 space-y-3 h-auto')]"));
        if (rooms.size() > 0) {
            System.out.println("Có nơi ở được hiển thị.");
        } else {
            System.out.println("Không có nơi ở nào được hiển thị!");
        }
    }
    @AfterMethod
    public void oneTimetearDown()  {
        this.waiting();
        driver.quit();
    }
}
