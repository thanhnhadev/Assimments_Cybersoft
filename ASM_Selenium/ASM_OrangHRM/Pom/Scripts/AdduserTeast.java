package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Scripts;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdduserTeast {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(5000);

            // Đăng nhập
            //tao doi tuong loginpage truyen driver vào doi tuong login page do
            LoginPage loginPage = new LoginPage(driver);
            //goi phuong thuc login tu class login page va truyen user nam va password
            loginPage.login("Admin", "admin123");
            Thread.sleep(5000);

            // Kiểm tra login thành công

            if (driver.getCurrentUrl().contains("dashboard")) {
                System.out.println("✅ Login thành công!");
            } else {
                System.out.println("❌ Login thất bại!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
