package overone104.com.lessons.les_3.classwork;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
//        if (condition) {operation};
        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("Inside If");
        }
        if (x - y < 3) {
            System.out.println("Difference is less than 3");
        }
        System.out.println("Outside If");

        /*if (condition) {operation}
        else {operation}*/
        int z;
        if (x < y) {
            System.out.println("Inside If");
        } else {
            System.out.println("Inside else");
        }

        System.out.println("After if-else");

        //if(condition){operation}else if(condition){operation}{else ...}
        Scanner scanner = new Scanner(System.in);
        String season; // time of the year
        System.out.println("Enter month number:");
        int month = scanner.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            season = "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Autumn";
        } else {
            season = "404";
        }

        //ternary operator
        System.out.println("What is your age?");
        byte minAccessAge = 18;
        byte age = scanner.nextByte();
        String accessMsg = age >= minAccessAge ? "Denied" : "You can come in";
        String msg;
        if (age >= minAccessAge) {
            msg = "Denied";
        } else {
            msg = "You can come in";
        }
        System.out.println(msg);
    }
}
