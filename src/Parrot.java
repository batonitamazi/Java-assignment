public class Parrot extends Animal implements Bird{
    private String color;

    public Parrot(String name, int age, AnimalType type, String habitat, String color) {
        super(name, age, type, habitat);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("ar vici java kargad!!");
    }

    public void fly() {
        System.out.println("flying flying flying");
    }
}