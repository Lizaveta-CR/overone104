package overone104.com.lessons.les_12.classwork.methods;

public class Methods_4 {
    public static void main(String[] args) {
        int result = sum(2, 4444, 55);
        int result2 = sum(1, 4, 9);
        int finalResult = result + result2;
        System.out.println(finalResult);
    }

    static int sum(int a, int b, int c) {
        byte sum = (byte) (a + b + c);
        return sum;
    }
}
