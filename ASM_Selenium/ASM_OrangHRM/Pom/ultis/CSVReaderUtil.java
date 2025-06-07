package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Pom.ultis;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderUtil {
    public static List<String[]> readCSV(String filepath) {
        List<String[]> users = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\susan.ta\\IdeaProjects\\demonew4\\users.csv"))) {
            String[] nextLine;
            boolean firstLine = true; // Cờ để bỏ qua dòng đầu tiên
            while ((nextLine = reader.readNext()) != null) {
                if (firstLine) {
                    firstLine = false; // Bỏ qua dòng đầu tiên (tiêu đề)
                    continue;
                }
                users.add(nextLine); // Thêm user vào danh sách
            }
            System.out.println("Đọc file CSV thành công!");
        } catch (Exception e) {
            System.err.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }
        return users;
    }
}
