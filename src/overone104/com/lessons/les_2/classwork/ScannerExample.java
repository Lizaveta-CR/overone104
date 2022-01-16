package overone104.com.lessons.les_2.classwork;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first: ");
//        int firstNum = scanner.nextInt();
//        System.out.println("Enter second: ");
//        int secondNum = scanner.nextInt();
//        int arithm = (firstNum + secondNum) / 2;
//        System.out.println("arithm = " + arithm);
//
//        boolean isGreater = firstNum > secondNum;
//        System.out.println("isGreater = " + isGreater);

//        System.out.println("Enter first: ");
//        double firstDoubleNum = scanner.nextDouble();
//        System.out.println("Enter second: ");
//        double secondDoubleNum = scanner.nextDouble();
//        double sum = 4 * firstDoubleNum + 2 * secondDoubleNum;
//        System.out.println("sum = " + sum);

        System.out.println("Enter first: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter string: ");
        String text = scanner.next();
        System.out.println("Enter double number: ");
        double thirdNum = scanner.nextDouble();

        System.out.println(text);
        double sum = firstNum + secondNum + thirdNum;
        System.out.println(sum);
    }
}
