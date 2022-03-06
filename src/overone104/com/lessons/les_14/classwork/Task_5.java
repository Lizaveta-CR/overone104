package overone104.com.lessons.les_14.classwork;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        compareStrings(enterStr(scanner), enterStr(scanner));
    }

    public static String enterStr(Scanner scanner) {
        System.out.println("Enter String");
        return scanner.nextLine();
    }

    public static void compareStrings(String str1, String str2) {
        int compareNum = str1.compareTo(str2);
        if (compareNum == 0) {
            System.out.println("Strings are equal");
        } else if (compareNum > 0) {
            System.out.println("First greater than second");
        } else {
            System.out.println("Else");
        }
    }
}
