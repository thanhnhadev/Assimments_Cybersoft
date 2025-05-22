package JavaBacsic.CyberSoft.ASMJava.Asm_C3;

public class ASM01 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15}; // Array đã sắp xếp tăng dần
        int target = 9; // Giá trị target cần tìm
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Chỉ số hai số có tổng bằng " + target + " là: " + (left + 1) + " và " + (right + 1));
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (!found) {
            System.out.println("Không tồn tại hai số có tổng bằng " + target);
        }
    }
}
