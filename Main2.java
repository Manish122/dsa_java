import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // arrTab(4, 4, arr);
        // int[] parcels = { 6, 5, 4, 1, 3 };
        ArrayList<Integer> list = new ArrayList(Arrays.asList(6, 5, 4, 1, 3));

        int k = 7;
        System.out.println(getMininmumCost(list, k));
    }

    private static int getMininmumCost(ArrayList<Integer> parcel, int k) {
        int n = parcel.size();
        if (n == k) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, parcel.get(i));
        }
        int[] arr = new int[max + 2];
        for (int item : parcel) {
            arr[item] = 1;
        }
        int c = 0;
        int i = 1;
        while (i <= k && n != k) {
            if (arr[i] == 0) {
                arr[i] = 1;
                c = c + i;
                n = n + 1;
            }
            i = i + 1;
        }
        // System.out.println(Arrays.toString(arr));
        return c;
    }

    private static void arrTab(int input1, int input2, int[] input3) {
        int index = (input2 - 1) % input1;
        int temp = input3[index];

        for (int i = index; i > 0; i--) {
            input3[i] = input3[i - 1];
        }

        input3[0] = temp;

        System.out.println();

        // Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for (int i = 0; i < input3.length; i++) {
            System.out.print(input3[i] + " ");
        }
    }
}
