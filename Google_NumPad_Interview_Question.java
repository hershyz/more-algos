import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String number = "3662277";
        String[] words = {"foo", "bar", "baz", "foobar", "emo", "cap", "car", "cat"};
        //Output should contain: [bar, cap, car, emo, foo, foobar]

        stringsInNum(number, words);
    }

    /*
    * 1 - nothing
    * 2 - abc
    * 3 - def
    * 4 - ghi
    * 5 - jkl
    * 6 - mno
    * 7 - pqrs
    * 8 - tuv
    * 9 - wxyz
    * 0 - nothing
    * */
    public static void stringsInNum(String number, String[] words) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String n = convert(word);
            if (number.contains(n)) {
                result.add(word);
            }
        }

        System.out.println(result);
    }

    public static String convert(String word) {
        String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            String c = String.valueOf(word.charAt(i));
            for (int j = 0; j < map.length; j++) {
                if (map[j].contains(c)) {
                    result += String.valueOf(j + 1);
                }
            }
        }
        return result;
    }
}
