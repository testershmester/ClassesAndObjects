package by.teachmeskills.practice;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, 10);
        boolean catHungry = cat.feeding(15);
        System.out.println("Is cat full?: " + catHungry);
    }
}
