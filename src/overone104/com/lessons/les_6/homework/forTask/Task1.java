package overone104.com.lessons.les_6.homework.forTask;

//Амеба делится каждые два три часа на 2, оперделить количесвто амеб через 3, 6... 24 часов.
public class Task1 {

    public static void main(String[] args) {
        int amountOfAmoebas = 1;
        final int hour = 24;
        for (int i = 3; i <= hour; i += 3) {
            amountOfAmoebas *= 2;
            System.out.println("Amoebas after " + i + " hour: " + amountOfAmoebas);
        }
    }
}
