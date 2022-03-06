package overone104.com.lessons.les_14.classwork;

public class StringBBMain {
    public static void main(String[] args) {
        //creation
        String str = "Java";
        String str2 = "C++";
        StringBuffer strBuffer = new StringBuffer(str);

        strBuffer.replace(0, str.length(), str2);
        System.out.println(strBuffer);
    }
}
