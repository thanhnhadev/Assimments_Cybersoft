package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.ultis;

import AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.Page.LoginPage;
import com.opencsv.CSVWriter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriteUtil {
    public static void writeCSV(String filepath, List<String[]> data){
        try (CSVWriter writer = new CSVWriter(new FileWriter("C:\\Users\\susan.ta\\IdeaProjects\\demonew4\\test_results.csv"))){
            writer.writeAll(data);
        } catch (IOException e){ //bat loi khi ghi file
            e.printStackTrace();// in chi tiet loi khi qua trinh ghi file bi loi ghi vao console
        }
    }
}
