package overone104.com.lessons.les_9.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter array length: ");
        String[] strArray = new String[size];
        System.out.println("Initialize array: ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scanner.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(strArray[i]);
        }
    }
}
