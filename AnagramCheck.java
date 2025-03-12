import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagramBruteForce(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isAnagramOptimized(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramOptimized("listen", "silent"));
        System.out.println(isAnagramOptimized("hello", "world"));
        System.out.println(isAnagramBruteForce("listen", "silent"));
        System.out.println(isAnagramBruteForce("hello", "world"));
    }
}
