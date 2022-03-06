package overone104.com.lessons.les_14.classwork;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        //есть массив строк, вывести на экран все строки
        //длинна которых больше N
        String text = "Olya\n" +
                "\n" +
                "Olya has a pen,\n" +
                "\n" +
                "She draws with a pencil,\n" +
                "\n" +
                "She";
        String[] massLines = devisionString(text);
        Scanner scanner = new Scanner(System.in);
        int length = initLength(scanner);
        inputLines(massLines, length);
    }

    private static void inputLines(String[] massLines, int length) {
        for (String line : massLines) {
            if (line.length() > length) {
                System.out.println(line);
            }
        }
    }

    static String[] devisionString(String massLines) {
        return massLines.split("\n");
    }

    public static int initLength(Scanner scan) {
        System.out.print("Enter length: ");
        return scan.nextInt();
    }
}
