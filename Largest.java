import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        // arr[i] = sc.nextInt();
        // }
        int[] arr = { 1, 4, 3, 4 };
        average(arr, 4);
    }

    private static void average(int[] arr, int n) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }
        int cmin = 0, cmax = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (min == arr[i]) {
                cmin += min;
                c++;
            }
            if (max == arr[i]) {
                cmax += max;
                c++;
            }
        }
        double d = (double) (cmin + cmax);
        double avg = (d / c);
        System.out.println(avg);
    }
}
