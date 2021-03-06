package overone104.com.lessons.les_3.home.task_4_1;

import java.util.Scanner;

//Реализуем калькулятор:
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scan.nextDouble();
        //declare variables just before it's usage. You could do it in the 21st line
        double result = 0.0;

        System.out.println("Enter action:");
        System.out.println("1 - Sum");
        System.out.println("2 - Division");
        System.out.println("3 - Difference");
        System.out.println("4 - Multiplication");
        int action = scan.nextInt();

        switch (action) {
            case 1:
                result = num1 + num2;
                //you duplicate this message in all cases. We could just assign result and print after switch-case
                break;
            case 2:
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    result = num1 / num2;
                }
                break;
            case 3:
                result = num1 - num2;
                break;
            case 4:
                result = num1 * num2;
                break;
            default:
                System.out.println("Sorry, something wrong");
        }
        System.out.println("Your result is: " + result);
    }
}

