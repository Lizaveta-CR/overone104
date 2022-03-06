package overone104.com.lessons.les_14.classwork;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        String word1 = "Shalala Jdbnd ddjkd ssks";
        Scanner scanner = new Scanner(System.in);
        int index = initIndex(scanner);
        String letter = initLetter(scanner);
        replaceChar(word1, index, letter.charAt(0));

    }

    static int initIndex(Scanner scanner) {
        System.out.println("Enter index");
        return scanner.nextInt();
    }

    static String initLetter(Scanner scanner) {
        System.out.println("Enter index");
        return scanner.next();
    }

    static void replaceChar(String strToChange, int index, char letter) {
        String[] strings = strToChange.split(" ");
        for (String word : strings) {
            if (word.length() > index) {
                char c = word.charAt(index);
                word.replace(c, letter);
            }
        }
    }
}
