package overone104.com.lessons.les_18.point_1;

public class Person {
    private String name;

    public Person(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Person %s \n", name);
    }
}
