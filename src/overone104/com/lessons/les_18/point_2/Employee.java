package overone104.com.lessons.les_18.point_2;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Employee " + getName());
    }
}
