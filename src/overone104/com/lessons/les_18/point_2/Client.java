package overone104.com.lessons.les_18.point_2;

public class Client extends Person {
    public Client(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Client " + getName());
    }
}
