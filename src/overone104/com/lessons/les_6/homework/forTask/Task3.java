package overone104.com.lessons.les_6.homework.forTask;

//Напишите программу печати таблицы перевода расстояний из дюймов
//в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task3 {
    public static void main(String[] args) {
        final double cm = 2.54;
        final int limit = 20;
        System.out.println("Result: ");

        for (int i = 1; i <= limit; i++) {
            System.out.print(i + "inch-" + cm * i + "cm, ");
        }
    }
}
