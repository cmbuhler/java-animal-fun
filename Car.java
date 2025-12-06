public class Car {
    private String name;
    private Animal animal;
    private Cat cat;
    private Dog dog;

    public Car(String name) {
        this.name = name;
        this.cat = new Cat(name);
        this.dog = new Dog(name);
        this.animal = this.cat; // Assigning a Cat instance to the Animal reference
        System.out.println(cat.meow());
    }

    @Override
    public String toString() {
        return "Car with passenger species: " + this.animal.getSpecies();
    }
}
