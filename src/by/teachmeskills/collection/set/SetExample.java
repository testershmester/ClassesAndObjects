package by.teachmeskills.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<>();
        System.out.println("Начальный размер связного списка: " + hs.size());
        System.out.println("Ввод элементов в связный список...");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        hs.add("D");
        hs.add("E");
        System.out.println("Размер связного списка: " + hs.size());
        System.out.println("Coдepжимoe связного списка: " + hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        System.out.println("Начальный размер связного списка: " + lhs.size());
        System.out.println("Ввод элементов в связный список...");
        lhs.add("C");
        lhs.add("A");
        lhs.add("B");
        lhs.add("D");
        lhs.add("E");
        System.out.println("Размер связного списка: " + lhs.size());
        System.out.println("Coдepжимoe связного списка: " + lhs);
    }
}
