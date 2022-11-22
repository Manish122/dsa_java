import java.util.*;

class Main {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;

        int totalWater = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> LIST = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            LIST.add(i);
        }
        int height[] = new int[LIST.size()];
        for (int i = 0; i < LIST.size(); i++) {
            height[i] = LIST.get(i);
        }
        System.out.println(trap(height));
    }
}