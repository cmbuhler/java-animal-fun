public class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }
    
    public String bark() {
        return "Woof! My name is " + this.name;
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }
    
}
