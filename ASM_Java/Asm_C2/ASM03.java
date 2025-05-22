package JavaBacsic.CyberSoft.ASMJava.Asm_C2;

public class ASM03 {
    public static void main(String[] args) {
        String input = "programming"; // Thay đổi chuỗi đầu vào tại đây

        // Giữ track ký tự đã xuất hiện: giả sử bảng Unicode 256 ký tự
        boolean[] seen = new boolean[256];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }

        System.out.println("Chuỗi sau khi bỏ ký tự lặp lại: " + result.toString());
    }
}
