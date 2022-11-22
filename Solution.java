public class Solution {
    public static void main(String[] args) {
        String str = "AEkjLoap";
        alikeString(str);
    }

    private static void alikeString(String input1) {
        int j = input1.length() - 1;
        int i = 0;
        int l = 0, r = 0;
        while (i < j) {
            if (isVowel(input1.charAt(i))) {
                l++;
            }
            if (isVowel(input1.charAt(j))) {
                r++;
            }
            i++;
            j--;
        }
        if (l == r) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
                || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

}
