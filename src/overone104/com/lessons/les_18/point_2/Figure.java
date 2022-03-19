package overone104.com.lessons.les_18.point_2;

public abstract class Figure {
    float x;
    float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getPerimeter();

    public abstract float getArea();
}
