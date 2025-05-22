package JavaBacsic.CyberSoft.ASMJava.Asm_C1;

import java.util.Scanner;

public class ASM03 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 101);// Thay đổi giá trị của n tại đây
        System.out.printf("số n cho truoc la:"+n);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("\nTổng các số chẵn từ 0 đến " + n + " là: " + sum);
    }
}
