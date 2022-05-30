import java.util.Arrays;

public class reverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }

    static String reverseWords(String s) {
        String[] strArr = s.split(" ");
        String rs = "";
        for (String ss : strArr) {
            char[] chars = ss.toCharArray();
            for (int i = 0; i < chars.length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - i - 1];
                chars[chars.length - i - 1] = temp;
            }
            rs = rs +" "+ new String(chars);
        }
        rs = rs.replaceFirst(" ","");
        return rs;
    }
}
