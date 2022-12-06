public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(isFibonacci(34));
    }

    private static boolean sqrRoot(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    private static boolean isFibonacci(int n) {
        return sqrRoot(5 * n * n - 4) || sqrRoot(5 * n * n + 4);
    }

    // private static int fib(int n) {
    // if (n <= 1) {
    // System.out.println(n);
    // return n;
    // }
    // // System.out.println(n);
    // return (fib(n - 1) + fib(n - 2));
    // // System.out.println(n);
    // }
}
