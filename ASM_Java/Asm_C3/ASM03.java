package JavaBacsic.CyberSoft.ASMJava.Asm_C3;

public class ASM03 {
    public static String findMinWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] targetCount = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < t.length(); i++) {
            targetCount[t.charAt(i)]++;
        }
        int required = t.length();
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int minLeft = -1;
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (targetCount[currentChar] > 0) {
                required--;
            }
            targetCount[currentChar]--;
            while (required == 0) {
                // Manually update minLength and minLeft
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }
                char leftChar = s.charAt(left);
                targetCount[leftChar]++;
                if (targetCount[leftChar] > 0) {
                    required++;
                }
                left++;
            }
            right++;
        }
        if (minLeft == -1) {
            return "";
        }
        char[] resultChars = new char[minLength];
        for (int i = 0; i < minLength; i++) {
            resultChars[i] = s.charAt(minLeft + i);
        }
        return new String(resultChars);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = findMinWindow(s, t);
        System.out.println("Chuỗi con nhỏ nhất chứa tất cả ký tự của t: " + result);
    }
}
