package JavaBacsic.CyberSoft.ASMJava.Asm_C3;

public class ASM02 {
    public static void main(String[] args) {
        String input = "babad"; // Thay đổi chuỗi đầu vào tại đây
        int n = input.length();
        String longestPalindrome = "";
        for (int i = 0; i < n; i++) {
            // Kiểm tra cho chuỗi đối xứng có độ dài lẻ
            for (int j = 0; j <= i && j < n - i; j++) {
                if (input.charAt(i - j) != input.charAt(i + j)) {
                    break;
                }
                String palindrome = input.substring(i - j, i + j + 1);
                if (palindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = palindrome;
                }
            }
            // Kiểm tra cho chuỗi đối xứng có độ dài chẵn
            for (int j = 0; j <= i && j < n - i - 1; j++) {
                if (input.charAt(i - j) != input.charAt(i + j + 1)) {
                    break;
                }
                String palindrome = input.substring(i - j, i + j + 2);
                if (palindrome.length() > longestPalindrome.length()) {
                    longestPalindrome = palindrome;
                }
            }
        }
        System.out.println("Chuỗi con đối xứng dài nhất là: " + longestPalindrome);
    }
}

