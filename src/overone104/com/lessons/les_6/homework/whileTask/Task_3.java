package overone104.com.lessons.les_6.homework.whileTask;

//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
public class Task_3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        while (i < 99) {
            i = i + 2;
            sum = sum + i;
        }
        System.out.println("Итог   : " + sum);
    }
}
