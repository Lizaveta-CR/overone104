package overone104.com.lessons.les_9.classwork;

public class Task_1 {
    public static void main(String[] args) {
        int[][] array = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
