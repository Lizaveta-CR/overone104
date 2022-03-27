package overone104.com.lessons.les_19.classwork.task_4;

public class Tomato extends Vegetable {
    public static final double TOMATO_COEFFICIENT = 0.25;

    public Tomato(double weight) {
        super(weight);
    }

    @Override
    public double getKkalAmount() {
        return getWeight() * TOMATO_COEFFICIENT;
    }
}

