package overone104.com.lessons.les_18.point_2;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {

        this.name = name;
    }

    public abstract void display();
}
