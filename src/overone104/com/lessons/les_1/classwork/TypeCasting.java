package overone104.com.lessons.les_1.classwork;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 120;
        short mySHort = myByte;
//        System.out.println(mySHort);
        mySHort = 200;

        myByte = (byte) mySHort;
        System.out.println(myByte);

        int myInt = myByte;

        double myDouble = 33.67;
        myInt = (int) myDouble;

        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);

        String myString = "Hello";
        byte mySecondInt = 5;
        System.out.println(myString + " " + mySecondInt);

        byte mySecondByte = 5;
        String numericString = "2";

        System.out.println(mySecondByte + numericString);
//
        String numericSecondString = "2";
        String numericThirdString = "2";
//
        System.out.println(numericSecondString + numericThirdString);

        byte a = 122;
        char c = (char) a;
    }
}
