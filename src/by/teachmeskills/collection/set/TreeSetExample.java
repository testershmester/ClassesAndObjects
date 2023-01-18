package by.teachmeskills.collection.set;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String name = String.valueOf(i + 1);
            Student student = new Student(name);
            student.setCourse(random.nextInt(5) + 1);
            boolean add = students.add(student);
            System.out.println("Is " + student + " added: " + add);
        }
        students.forEach(System.out::println);

        TreeSet<String> ts = new TreeSet<>();
        System.out.println("Начальный размер связного списка: " + ts.size());
        System.out.println("Ввод элементов в связный список...");
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("D");
        ts.add("E");
        System.out.println("Размер связного списка: " + ts.size());
        System.out.println("Coдepжимoe связного списка: " + ts);
    }
}
