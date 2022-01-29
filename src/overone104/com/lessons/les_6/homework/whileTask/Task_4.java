package overone104.com.lessons.les_6.homework.whileTask;

//Даны числа от 0 до 100.
//Посчитать сумму четных и вывести на экран
//Посчитать сумму нечетных и вывести на экран
//Найти общую сумму всех чисел
public class Task_4 {
    public static void main(String[] args) {
        int c = 0; //переменная четных чисел
        int sumChet = 0; //сумма сумм четных чисел
        int sumNoChet = 0;
        while (c <= 100) {
            if (c % 2 == 0) {
                sumChet += c;
            } else {
                sumNoChet += c;
            }
            c++;
        }
        System.out.println("Сумма четных чисел: " + sumChet);
        System.out.println("Сумма не четных чисел: " + sumNoChet);
        System.out.println("Общаяя сумма: " + (sumChet + sumNoChet));
    }
}
