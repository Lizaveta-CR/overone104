package overone104.com.lessons.les_6.homework.forTask;

import java.util.Scanner;

//A*B
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entire first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Entire second number: ");
        int secondNumber = scan.nextInt();
        int result = 0;
        if (secondNumber < 0 && firstNumber < 0) {
            secondNumber = -secondNumber;
            firstNumber = -firstNumber;
            for (int i = 0; i < secondNumber; i++) {
                result += firstNumber;
            }
        } else if (secondNumber < 0) {
            secondNumber = -secondNumber;
            for (int i = 0; i < secondNumber; i++) {
                result += firstNumber;
            }
            result = -result;
        } else if (firstNumber < 0) {
            firstNumber = -firstNumber;
            for (int i = 0; i < secondNumber; i++) {
                result += firstNumber;
            }
            result = -result;
        }
        System.out.println("Result is " + result);
    }
}
