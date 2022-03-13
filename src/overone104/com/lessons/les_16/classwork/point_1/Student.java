package overone104.com.lessons.les_16.classwork.point_1;

public class Student {
    String name;
    int courseNum;

    {
        name = "John";
        courseNum = 4;
//        displayInfo();
    }

    private void displayInfo() {
        System.out.println(name + " " + courseNum);
    }

    public void displayPublicInfo() {
        System.out.println(name + " " + courseNum);
    }
}
