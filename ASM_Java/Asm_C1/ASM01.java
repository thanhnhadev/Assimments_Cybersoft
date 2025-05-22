package JavaBacsic.CyberSoft.ASMJava.Asm_C1;

import java.util.Scanner;

public class ASM01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String str = scanner.nextLine();
        String chuoi = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Kiểm tra nếu không phải nguyên âm thì mới cộng vào chuỗi
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                chuoi += c;
            }
        }
        System.out.println("Chuoi sau khi xoa nguyen am: " + chuoi);
    }
}
