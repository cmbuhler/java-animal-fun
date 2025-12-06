public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    
    public String meow() {
        return "Meow! My name is " + this.name;
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }
}
