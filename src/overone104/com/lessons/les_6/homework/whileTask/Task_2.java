package overone104.com.lessons.les_6.homework.whileTask;

// Напишите программу вывода всех четных чисел от 2 до 100 включительно
public class Task_2 {
    public static void main(String[] args) {
        int i = 0;

        int limit = 100;
        while (i < limit) {
            i = i + 2;
            System.out.println(i);
        }
    }
}
