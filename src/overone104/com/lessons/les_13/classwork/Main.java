package overone104.com.lessons.les_13.classwork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "text";
        String str2 = new String(new char[]{'t', 'e', 'x', 't'});
        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.length());

        char[] charArray = str1.toCharArray();
        System.out.println(Arrays.toString(charArray));

        String s = "";
        System.out.println(s.length());//0

        System.out.println(s.isEmpty());//true

        String s1 = null;
        if (s1 != null && !s1.isEmpty()) {
            System.out.println(s1.length());
        }

        //concatenation

        String str3 = "Java";
        String str4 = "Hello";
        String str5 = str3 + str4;
        String str6 = str3.concat(str4);
        System.out.println("Str 5 = " + str5);
        System.out.println("Str 3 = " + str3);
        System.out.println("Str 6 = " + str6);

        String str7 = str1 + 2022;
        System.out.println("Str 7 = " + str7);

        String str8 = String.join(", ", str3, str4);
//        String str9 = str3.join(", ", str3, str4);
        System.out.println(str8);
//        System.out.println(str9);

        char charOfIndex = str3.charAt(2);
        System.out.println(charOfIndex);

        String str12 = "Javaa";
        String str13 = "Hello";
        System.out.println("str12.equals(str4) = " + str12.equals(str4));
        String str10 = "java sss";
        System.out.println("str12.equalsIgnoreCase(str10) = " + str12.equalsIgnoreCase(str10));
        System.out.println();
        String str11 = new String("Java");
        System.out.println("str12 = str13 = " + (str12 == str13));
        System.out.println("str12 == str11: " + (str12.equals(str11)));

        //compareTo()
        System.out.println("Compare result of str12 and str13: " + str13.compareTo(str12));

        //index(), startsWith(), endsWith()

        System.out.println("str10.indexOf('s') = " + str10.indexOf('s'));
        System.out.println(str10.startsWith("java"));
        System.out.println(str10.endsWith("s"));

        //replace()
        String str14 = "Hello world";
        String str15 = str14.replace('l', 'd');
        System.out.println(str15);
        String str16 = str14.replace("Hello", "Bye");
        System.out.println(str16);

        //trim()
        String str17 = "         hello world ";
        String str17Trim = str17.trim();
        System.out.println("str17.length() = " + str17.length());
        System.out.println("str17Trim.length() = " + str17Trim.length());

        //substring()
        System.out.println(str14.substring(6));
        System.out.println(str14.substring(3, 5));

        //toUpperCase(), toLowerCase()
        System.out.println(str14.toUpperCase());
        System.out.println(str14.toLowerCase());

        //split()
        String str18 = "I love Java so much";
        String[] strArray = str18.split(" ");
        String[] strArray2 = str18.split("o");
        String[] strArray3 = str18.split("a");
        for (String word : strArray) {
            System.out.print(word + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(strArray2));
        System.out.println(Arrays.toString(strArray3));
    }
}
