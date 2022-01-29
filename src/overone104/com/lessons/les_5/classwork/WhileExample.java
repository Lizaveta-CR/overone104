package overone104.com.lessons.les_5.classwork;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter--;
        }

        //===sum===
        double sum = 0;
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        double i = 1;
        while (i <= inputNumber) {
            sum += 1 / i;
            i++;
        }
        System.out.println(sum);
    }
}
