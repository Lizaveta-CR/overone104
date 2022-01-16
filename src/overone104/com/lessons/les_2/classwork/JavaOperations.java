package overone104.com.lessons.les_2.classwork;

public class JavaOperations {
    public static void main(String[] args) {
        byte num_1 = 100;
        byte num_2 = 100;

        int sum = num_1 + num_2;
        long myLong = 100;
        long sumLong = sum + myLong;

        System.out.println(100 / 33);
        System.out.println(100.0 / 33);
        System.out.println(100 / 33.0);
//        System.out.println(0 / 0);
        System.out.println(0 / 0.0);
        System.out.println(4 % 2);

        //вначале значение переменной a увеличивается на 1, а затем ее значение присваивается переменной b
        int a = 8;
        int b = ++a;//префиксный инкремент
        System.out.println(a);
        System.out.println(b);

        int c = 8;
        int d = c++;//постфиксный инкремент
        System.out.println(c);
        System.out.println(d);

        int myInt = 100;
        myInt += 10;
        System.out.println("myInt = " + myInt);

        System.out.println("myInt++ = " + myInt++);

        System.out.println("++myInt = " + ++myInt);

        //why not to use in financial calculations?
        double dif = 2.0 - 1.1;
        System.out.println(dif);//на низком уровне для представления чисел с плавающей точкой применяется двоичная система, однако для числа 0.1 не существует двоичного представления
    }
}
