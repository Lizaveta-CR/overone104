package overone104.com.lessons.les_18.point_1;

public class Main {
    public static void main(String[] args) {
//toString() -  служит для получения представления данного объекта в виде строки
        Person tom = new Person("Tom");
        System.out.println(tom);
//hashCode() - позволяет задать некоторое числовое значение, которое будет соответствовать
// данному объекту или его хэш-код. По данному числу, например, можно сравнивать объекты.
        System.out.println(tom.hashCode());
        //getClass() - озволяет получить тип данного объекта
        System.out.println(tom.getClass());
        //equals() - сравнивает два объекта на равенство
        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob));
    }
}
