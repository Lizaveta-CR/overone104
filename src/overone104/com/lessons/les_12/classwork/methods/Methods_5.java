package overone104.com.lessons.les_12.classwork.methods;

public class Methods_5 {
    public static void main(String[] args) {
        System.out.println(daytime(7));
        System.out.println(daytime(13));
        System.out.println(daytime(18));
        System.out.println(daytime(2));
    }

    static String daytime(int hour) {
        if (hour > 24 || hour < 0) {
            return "Invalid data";
        } else if (hour > 21 || hour < 6) {
            return "Good night";
        } else if (hour >= 15) {
            return "Good evening";
        } else if (hour >= 11) {
            return "Good after noon";
        } else {
            return "Good morning";
        }
    }
}
