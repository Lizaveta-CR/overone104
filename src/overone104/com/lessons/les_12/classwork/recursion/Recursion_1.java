package overone104.com.lessons.les_12.classwork.recursion;

public class Recursion_1 {
    public static void main(String[] args) {
        int result = sum(-1);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
