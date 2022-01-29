package overone104.com.lessons.les_6.classwork;

public class MultiTriangle {
    public static void main(String[] args) {
        int rows, i, j;
        rows = 6;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
