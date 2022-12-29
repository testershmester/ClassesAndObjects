package by.teachmeskills.practice;

import java.util.Random;

public class Student {
    private String name;
    private String groupNumber;
    private int mark;

    public static final String GROUP_NUMBER = "12345-AB";
    private Random random;

    public Student(String name) {
        this.name = name;
        this.groupNumber = GROUP_NUMBER;
        this.mark = getRandom().nextInt(11);
    }

    public void printStudentInfo() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student groupNumber: " + this.groupNumber);
        System.out.println("Student mark: " + this.mark + "\n");
    }

    private Random getRandom() {
        if (random == null) {
            random = new Random();
        }
        return random;
    }

    public int getMark() {
        return mark;
    }
}
