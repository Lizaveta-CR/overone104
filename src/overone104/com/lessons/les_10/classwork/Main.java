package overone104.com.lessons.les_10.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
            }
        }
        int[] evenArray = new int[evenNum];
        int[] oddArray = new int[oddNum];
        int k = 0;
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenArray[k] = array[i][j];
                    k++;
                } else {
                    oddArray[m] = array[i][j];
                    m++;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));
    }
}
