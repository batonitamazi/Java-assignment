public class Dog extends Animal implements Pet{
    String breed;
    public Dog(String name, int age, AnimalType type, String habitat, String breed) {
        super(name, age, type, habitat);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println("woof woof woof woof!!!!!!!!");
    }
    public void sleeping() {
        System.out.println("bzzzzzzz!!!!!!");
    }

}
