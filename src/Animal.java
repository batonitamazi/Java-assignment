public abstract class Animal {
    private String name;
    private int age;
    private AnimalType type;
    private String habitat;

    public Animal(String name, int age, AnimalType type, String habitat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public AnimalType getType() {
        return type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // This is an abstract method, which means it must be implemented by any non-abstract subclass of Animal
    public abstract void makeSound();
}
