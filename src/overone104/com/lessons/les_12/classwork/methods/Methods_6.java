package overone104.com.lessons.les_12.classwork.methods;

public class Methods_6 {
    public static void main(String args[]) {
        daytime(-7);
    }

    static void daytime(int hour) {
        if (hour > 24 || hour < 0)
            return;
        if (hour > 21 || hour < 6)
            System.out.println("Good night");
        else if (hour >= 15)
            System.out.println("Good evening");
        else if (hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}
