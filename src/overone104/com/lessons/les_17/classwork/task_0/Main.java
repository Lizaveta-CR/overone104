package overone104.com.lessons.les_17.classwork.task_0;

public class Main {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        income.print();
        System.out.println(income);
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);
    }
}
