import java.util.*;;

public class twoDimension {
    public static void main(String[] args) {
        int[][] arr = {
                { 75, 76, 65, 87, 87 },
                { 78, 76, 68, 56, 89 },
                { 67, 87, 78, 77, 65 }
        };
        int r = 3;
        int c = 5;
        double avg = Integer.MAX_VALUE, sum = 0;
        System.out.println(arr.length);
        for (int row = 0; row < c; row++) {
            for (int col = 0; col < r; col++) {
                sum += arr[col][row];
                System.out.print(arr[col][row] + " ");
            }

            avg = Math.min(avg, sum / r);
            System.out.println(sum);
            sum = 0;
        }
        System.out.printf("%.2f", avg);
    }
}
