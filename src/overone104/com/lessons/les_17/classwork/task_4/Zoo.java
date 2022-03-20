package overone104.com.lessons.les_17.classwork.task_4;

public class Zoo {
    private Animal[] animals;
    private int animalCount;

    public Zoo() {
        animals = new Animal[10];
        animalCount = 0;
    }

    public void soundOff() {
        for (int i = 0; i < animalCount; ++i) {
            System.out.println(animals[i].speak());
        }
    }

    public int getAnimalCount() {
        System.out.println("This zoo has " + animalCount + " animals.");
        return animalCount;
    }

    public void add(Animal animal) {
        animals[animalCount++] = animal;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Dog("Chloe"));
        zoo.add(new Cat("Fiona"));
        zoo.soundOff();
        zoo.getAnimalCount();
    }
}
