import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        // arr[i] = sc.nextInt();
        // }
        int[] arr = { 1, 3, 2, 4, 5 };
        averageCount(arr, 5);
    }

    private static void averageCount(int[] arr, int n) {
        int avg, sum = 0, c = 0;
        ;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == sum / n) {
                c++;
            }
        }
        System.out.println(c);
    }
}
