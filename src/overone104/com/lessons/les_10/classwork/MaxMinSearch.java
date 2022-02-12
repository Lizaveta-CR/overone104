package overone104.com.lessons.les_10.classwork;

public class MaxMinSearch {
    public static void main(String[] args) {
        int[] array = {10, -1, -2, 0, -10};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
