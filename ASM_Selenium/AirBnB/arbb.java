package AutomationTest.CyberSoft.Selenium.AirBnB;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public class arbb {
//    static Logger logger = LogManager.getLogger("testBookingairbnb");

    public static void main(String[] args) {

//        logger.info("Bắt đầu test case");
//
//        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            //Vao demo 4 website
            driver.get("https://demo4.cybersoft.edu.vn/");
            driver.manage().window().maximize();
            Thread.sleep(4000);

            //chon Dia diem

            driver.findElement(By.xpath("//div[contains(@class,'col-span-3')][1]")).click();
            Thread.sleep(5000);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// B1: Tìm phần tử
            WebElement hoChiMinh = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[contains(@class,'cursor-pointer')]//p[text()='Hồ Chí Minh']")));

// B2: Scroll vào vùng nhìn thấy
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", hoChiMinh);
            Thread.sleep(500); // Chờ thêm chút để ổn định

// B3: Click bằng JavaScript (chắc ăn khi bị overlay)
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hoChiMinh);

            System.out.println("Click Hồ Chí Minh thành công");


//            WebElement hoChiMinh = driver.findElement(By.xpath("//div[contains(@class,'cursor-pointer')]//p[text()='Hồ Chí Minh']"));
//
//            // Scroll vào vùng nhìn thấy
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hoChiMinh);
//            Thread.sleep(500);
//            hoChiMinh.click();
//
//            System.out.println("click ho chi minh thanh cong");
            Thread.sleep(4000);
            // Mở lịch
            driver.findElement(By.xpath("//div[contains(@class,'grid-cols-12')]/div[3]")).click();
            Thread.sleep(5000);
            // Chọn ngày đi
            driver.findElement(By.xpath("//div[contains(text(), 'May 2025')]/following::span[@class='rdrDayNumber']/span[text()='24']")).click();

            // Chọn ngày về
            driver.findElement(By.xpath("//div[contains(text(), 'May 2025')]/following::span[@class='rdrDayNumber']/span[text()='25']")).click();

            //Chon so khach
            driver.findElement(By.xpath("//div[contains(@class,'col-span-3 flex-1 p-3 flex')]")).click();

            driver.findElement(By.xpath("//button/div[text()='+']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@aria-label='search']")).click();
            System.out.println("search thanh cong");
            Thread.sleep(5000);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'py-12 space-y-3 h-auto')]")));
            System.out.println("trang kết quả đã được tải.");
            List<WebElement> rooms = driver.findElements(By.xpath("//div[contains(@class, 'py-12 space-y-3 h-auto')]"));

            if (rooms.size() > 0) {
                System.out.println("Có nơi ở được hiển thị.");
            } else {
                System.out.println("Không có nơi ở nào được hiển thị!");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
