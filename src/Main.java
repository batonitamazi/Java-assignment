// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dog dog_1 = new Dog("jeka", 2, AnimalType.MAMMAL, "chemi_ubani", "kavkasiuri_nagazi");
        Parrot bird_1 = new Parrot("chico",2, AnimalType.BIRD, "galia", "chreli");
        System.out.println(dog_1.getBreed());
        System.out.println(bird_1.getColor());
        System.out.println(dog_1.getAge());
    }
}
