package Buoi9_WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_WebDriver {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.diver", "D:\\java\\Test_Selenium\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//thời gian chờ ngầm định
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
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
		//lấy đối tượng là thẻ th trong bảng table
//		List<WebElement> thList=driver.findElements(By.xpath("//div[contains(@class, 'oxd-table-cell') and @style]/div"));
//		List<WebElement> iList=driver.findElements(By.xpath("//div[contains(@class, 'oxd-table-header-cell')]"));
////		for (int i = 0; i < iList.size(); i++) {
////			//chạy từ 0 đến bé hơn độ dài của list trên
////			//và in ra giá trị text của thẻ i trên(th trong table)
////			System.out.println(iList.get(i).getText().contains("Username"));
////		}
//		for (int i = 1; i < thList.size(); i++) {
//			//chạy từ 0 đến bé hơn độ dài của list trên
//			//và in ra giá trị text của thẻ th trên(th trong table)
//			System.out.println(thList.get(i).getText());
//			if (iList.get(i).getText()!="") {
//				System.out.println(thList.get(i).getText().contains("abinthat"));
//			}else {
//				System.out.println(thList.get(i).getText().equals(""));
//			}
//		}
		//tìm 1 element trong 1 khung frame website  
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		System.out.println("finish");
		driver.quit();
	}

}
