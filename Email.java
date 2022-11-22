import java.util.Arrays;

public class Email {
    public static void main(String[] args) {
        String[] arr = { "ghi@hotmail.com", "def@yahoo.com", "ghi@gmail.com", "abc@channelier.com", "abc@hotmail.com",
                "def@hotmail.com", "abc@gmail.com", "abc@yahoo.com", "def@channelier.com", "jkl@hotmail.com",
                "ghi@yahoo.com", "def@gmail.com" };
        sortArr(arr);
    }

    private static void sortArr(String[] arr) {
        Arrays.sort(arr);
        sendMail(arr);
    }

    private static void sendMail(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
