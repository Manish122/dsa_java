public class Exceptiion_Handling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            int c = b / a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fun1();
    }

    public static void fun1() {
        System.out.println("fun1");
        try {
            fun2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void fun2() throws Exception {
        boolean isDanger = true;
        if (isDanger) {
            throw new Exception("Danger is coming");
        }
    }
}
