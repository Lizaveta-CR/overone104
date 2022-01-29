package overone104.com.lessons.les_3.home.task_2_2;

import java.util.Scanner;
//Пользователь вводит 2 числа. Проверить кратное ли первое второму

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();

        if (num1 % num2 == 0) {
            System.out.println("first number multiple second number");
        } else {
            System.out.println("first number is not multiple second number");
        }
    }
}

