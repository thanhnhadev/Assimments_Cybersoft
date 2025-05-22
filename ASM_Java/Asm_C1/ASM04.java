package JavaBacsic.CyberSoft.ASMJava.Asm_C1;

public class ASM04 {
    public static void main(String[] args) {
        String text = "   xin chao cac ban   ";
        if (text == null || text.isEmpty()) {
            System.out.println("Số từ trong chuỗi là: 0");
            return;
        }
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Kiểm tra nếu ký tự là chữ cái hoặc chữ số
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("Số từ trong chuỗi là: " + wordCount);
    }
}
