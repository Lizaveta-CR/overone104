package overone104.com.lessons.les_12.classwork.methods;

public class PassVariable {
    public static void main(String[] args) {
        int var = 7;
        increase(var);
        System.out.println(var);
    }

    static void increase(int x) {
        x++;
    }
}
