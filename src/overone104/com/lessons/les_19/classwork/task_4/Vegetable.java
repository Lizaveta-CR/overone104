package overone104.com.lessons.les_19.classwork.task_4;

public abstract class Vegetable {
    private final double weight;

    Vegetable(double weight) {
        this.weight = weight;
    }

    public abstract double getKkalAmount();

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" + getClass().getSimpleName() +
                ": weight=" + weight +
                '}';
    }
}
