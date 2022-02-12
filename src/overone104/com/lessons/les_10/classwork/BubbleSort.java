package overone104.com.lessons.les_10.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        int max = 20;
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println(Arrays.toString(array));

//sorting
        int temp = 0;
        int k = 0;
        while (k < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            k++;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
