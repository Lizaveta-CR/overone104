package overone104.com.lessons.les_12.classwork.practice;

import java.util.Arrays;
import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[initSize(scanner)];
        int[] initArray = initArray(scanner, array);

        outputArray(initArray);
    }

    static int initSize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Error. Try again!");
            initSize(scanner);
        }
        return size;
    }

    static int[] initArray(Scanner scanner, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
