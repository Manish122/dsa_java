import java.util.*;

public class program {
    public static void main(String[] args) {
        String[][] dependency = { { "settings.c", "graphics.c" }, { "settings.c", "sound.c" },
                { "game.c", "settings.c" } };
        // System.out.println(dependency[0][1]);
        System.out.println(Arrays.toString(ordering(3, dependency)));
    }

    public static String[] ordering(int N, String[][] dependency) {
        ArrayList<String> newString1 = new ArrayList<>();
        ArrayList<String> newString2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (!newString2.contains(dependency[i][0])) {
                newString2.add(dependency[i][0]);
            } else {
                continue;
            }
        }
        for (int i = 0; i < N; i++) {
            if (!newString1.contains(dependency[i][1])) {
                newString1.add(dependency[i][1]);
            } else {
                continue;
            }
        }
        System.out.println(newString1);

        Collections.sort(newString1,
                String.CASE_INSENSITIVE_ORDER);
        Collections.sort(newString2,
                String.CASE_INSENSITIVE_ORDER);
        String[] result = new String[newString1.size() + newString2.size()];
        System.out.println(newString2);
        int j = 0;
        for (String str : newString1) {
            result[j++] = str;
        }
        for (String str : newString2) {
            result[j++] = str;
        }
        return result;
    }
}
