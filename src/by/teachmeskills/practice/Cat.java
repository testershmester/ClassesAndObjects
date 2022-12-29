package by.teachmeskills.practice;

public class Cat {
    private String name;
    private int age;
    private int foodCount;

    public Cat(String name, int age, int foodCount) {
        this.name = name;
        this.age = age;
        this.foodCount = foodCount;
    }

    public boolean feeding(int foodCount) {
        return this.foodCount <= foodCount;
    }
}
