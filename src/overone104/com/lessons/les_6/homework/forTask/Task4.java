package overone104.com.lessons.les_6.homework.forTask;

//Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?
public class Task4 {
    public static void main(String[] args) {
        double finalDistance = 10;
        double way = 10;
        for (int i = 0; i < 6; i++) {
            finalDistance += finalDistance * 0.1;
            way += finalDistance;
        }
        System.out.printf("Final distance which runner has been run: %.2f km", finalDistance);
        System.out.println("\n" + way);
    }
}
