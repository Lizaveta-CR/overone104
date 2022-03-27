package overone104.com.lessons.les_19.classwork.task_4;

public class Cucumber extends Vegetable {
    public static final double CUCUMBER_COEFFICIENT = 0.5;

    public Cucumber(double weight) {
        super(weight);
    }

    @Override
    public double getKkalAmount() {
        return getWeight() * CUCUMBER_COEFFICIENT;
    }
}
