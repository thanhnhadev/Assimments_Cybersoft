package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args){

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //thời gian chờ ngầm định
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Admin")).click();
//		Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
//		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
//		Thread.sleep(1000);



        driver.quit();
    }

}

