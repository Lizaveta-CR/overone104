package overone104.com.lessons.les_3.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        if (secondNum != 0) {
            System.out.println(firstNum / secondNum);
        } else {
            System.out.println("Division by 0 is forbidden");
        }
    }
}
