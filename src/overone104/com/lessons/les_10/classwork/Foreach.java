package overone104.com.lessons.les_10.classwork;

public class Foreach {
    public static void main(String[] args) {
        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
//        for (int i = 0; i < arrData.length; i++) {
//            System.out.println(arrData[i]);
//        }

        for (String temp : arrData) {
            System.out.println(temp);
        }
        //foreach
        System.out.println("====");

        int[] intArrData = {1, 2, 3, 4};
        for (int temp : intArrData) {
            System.out.print(temp);
        }
        System.out.println();
        System.out.println("====");
        //foreach

        int[][] twoDimArrData = {{1, 2, 3}, {1, 2, 3}};
        for (int[] arrayTemp : twoDimArrData) {
            for (int temp : arrayTemp) {
                System.out.print(temp + "\t");
            }
            System.out.println();
        }
    }
}
