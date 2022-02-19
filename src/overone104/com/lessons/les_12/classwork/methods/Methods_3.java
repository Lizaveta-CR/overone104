package overone104.com.lessons.les_12.classwork.methods;

public class Methods_3 {
    public static void main(String[] args) {
        //
    }

    static void sum(int... nums) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        System.out.println(result);
    }

    static void sum(String message, int... nums) {

        System.out.println(message);
        int result = 0;
        for (int x : nums) {
            result += x;
        }
        System.out.println(result);
    }
}
