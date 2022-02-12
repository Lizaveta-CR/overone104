package overone104.com.lessons.les_10.classwork;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 4, 5, 40};

        int numToFind = 5;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (numToFind == array[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
