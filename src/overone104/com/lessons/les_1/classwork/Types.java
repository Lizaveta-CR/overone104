package overone104.com.lessons.les_1.classwork;

public class Types {
    public static void main(String[] args) {
        // byte, short, char, int
        /*
        byte 2^8 -> 2^7-1
        short 2^16
        char 2^16
        int 2^32
        long 2^64
        */

//type variableName = value;
        byte myByte = 1;
        System.out.println(myByte);

        byte mySecondByte;
//        mySecondByte = false;


        long myNum = 15000000000l;
        System.out.println(myNum);

        float fl=myNum;
        //ASCII
        char myCharNumber = 33;
        char myCharSymbol = 'K';
        char myCharUtf = '\u33f4';
        System.out.println("myCharNumber = " + myCharNumber);
        System.out.println("myCharSymbol = " + myCharSymbol);
        System.out.println("myCharUtf = " + myCharUtf);

        // float, double
        float myFloat = 33;
        double myDouble = 44;

        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
    }
}
