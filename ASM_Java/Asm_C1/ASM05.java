package JavaBacsic.CyberSoft.ASMJava.Asm_C1;

public class ASM05 {
    public static void main(String[] args) {
        String text = "Xin chao cac ban";
        if (text == null || text.isEmpty()) {
            System.out.println("Chuỗi rỗng hoặc null.");
            return;
        }
        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    // In chữ cái đầu tiên của từ
                    System.out.print(c + " ");
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println();
    }
}
