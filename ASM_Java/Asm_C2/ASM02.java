package JavaBacsic.CyberSoft.ASMJava.Asm_C2;

public class ASM02 {
    public static void main(String[] args) {
        String input = "level"; // Thay đổi chuỗi kiểm tra tại đây
        if (input == null) {
            System.out.println(false);
            return;
        }
        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
