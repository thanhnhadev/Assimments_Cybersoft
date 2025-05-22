package JavaBacsic.CyberSoft.ASMJava.Asm_C2;

import java.util.Scanner;

public class ASM01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thu nhập hàng năm
        System.out.print("Nhập thu nhập hàng năm (VND): ");
        double thuNhap = scanner.nextDouble();

        // Khai báo các mức thuế suất và ngưỡng thu nhập
        double thue = 0;
        double thuNhapChiuThue = thuNhap;

        // Mức 1: Thu nhập từ 0 đến 5 triệu đồng
        if (thuNhapChiuThue > 0) {
            double muc1 = Math.min(5000000, thuNhapChiuThue);
            thue += muc1 * 0.05;
            thuNhapChiuThue -= muc1;
        }

        // Mức 2: Thu nhập từ 5 triệu đến 10 triệu đồng
        if (thuNhapChiuThue > 0) {
            double muc2 = Math.min(5000000, thuNhapChiuThue);
            thue += muc2 * 0.10;
            thuNhapChiuThue -= muc2;
        }

        // Mức 3: Thu nhập từ 10 triệu đến 18 triệu đồng
        if (thuNhapChiuThue > 0) {
            double muc3 = Math.min(8000000, thuNhapChiuThue);
            thue += muc3 * 0.15;
            thuNhapChiuThue -= muc3;
        }

        // Mức 4: Thu nhập từ 18 triệu đến 32 triệu đồng
        if (thuNhapChiuThue > 0) {
            double muc4 = Math.min(14000000, thuNhapChiuThue);
            thue += muc4 * 0.20;
            thuNhapChiuThue -= muc4;
        }

        // Mức 5: Thu nhập từ 32 triệu đến 52 triệu đồng
        if (thuNhapChiuThue > 0) {
            double muc5 = Math.min(20000000, thuNhapChiuThue);
            thue += muc5 * 0.25;
            thuNhapChiuThue -= muc5;
        }

        // Mức 6: Thu nhập từ 52 triệu đến 80 triệu đồng
        if (thuNhapChiuThue > 0) {
            double muc6 = Math.min(28000000, thuNhapChiuThue);
            thue += muc6 * 0.30;
            thuNhapChiuThue -= muc6;
        }

        // Mức 7: Thu nhập trên 80 triệu đồng
        if (thuNhapChiuThue > 0) {
            thue += thuNhapChiuThue * 0.35;
        }

        // Xuất kết quả
        System.out.printf("Số thuế phải nộp là: %.2f VND\n", thue);
    }
}
