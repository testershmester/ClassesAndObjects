package by.teachmeskills.practice.interfaceexample.animals;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat(12345);
        cat.setName("Barsic");

        Cat cat1 = new Cat(12345);
        cat1.setName("Barsic");

        System.out.println(cat);
        System.out.println(cat.equals(cat1));
    }
}
