package overone104.com.lessons.les_12.classwork.methods;

public class Methods_3 {
    public static void main(String[] args) {
        sum(1, 2, 3, 5, 6, 7, 8, 21, 24, 5, 666, 5);
        sum();
        sumStr("text", 1, 4);
    }

    static void sum(int... nums) {
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        System.out.println(result);
    }

    static void sumStr(String message, int... nums) {

        System.out.println(message);
        int result = 0;
        for (int x : nums) {
            result += x;
        }
        System.out.println(result);
    }
}
