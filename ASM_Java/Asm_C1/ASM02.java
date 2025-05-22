package JavaBacsic.CyberSoft.ASMJava.Asm_C1;

public class ASM02 {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 20, 15 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ 2.");
        } else {
            System.out.println("Số lớn thứ 2 là: " + secondMax);
        }
    }
}
