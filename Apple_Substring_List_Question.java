import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String s = "ADOBECODEBANCACB";
        String t = "ABC";
        int k = 5;
        List<String> x = solution(s, t, k);

        System.out.println(x);
    }

    public static List<String> solution(String s, String t, int k) {

        List<String> solutionSet = new ArrayList<>();

        for (int size = t.length(); size <= s.length(); size++) {
            int left = 0;
            int right;
            for (right = left + size - 1; right < s.length(); right++) {
                String sub = getString(s, left, right);
                if (contains(sub, t)) {
                    solutionSet.add(sub);
                }
                if (solutionSet.size() == k) {
                    return solutionSet;
                }
                left++;
            }
        }

        return solutionSet;
    }

    public static String getString(String s, int l, int r) {
        String result = "";
        for (int i = l; i <= r; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean contains(String a, String b) {
        for (int i = 0; i < b.length(); i++) {
            if (!a.contains(String.valueOf(b.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
