package overone104.com.lessons.les_6.homework.whileTask;

// Вычислить: 1+2+4+8+...+256
public class Task_1 {
    public static void main(String[] args) {
        final int LAST_NUMBER = 256;
        int sumResult = 1;
        int counter = 1;
        while (counter < LAST_NUMBER) {
            counter += counter;
            sumResult += counter;
        }
        System.out.print("Result is " + sumResult);
    }
}
