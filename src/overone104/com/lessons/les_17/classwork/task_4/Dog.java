package overone104.com.lessons.les_17.classwork.task_4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return getName() + " says woof, woof!";
    }

}
