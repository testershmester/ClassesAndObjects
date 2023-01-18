package by.teachmeskills.collection.list;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>(); // создать двустороннюю очередь
        // использовать класс ArrayDeque для организации стека
        System.out.println("Начальный размер очереди: " + adq.size());
        System.out.println("Ввод элементов...");
        adq.add("A");
        adq.add("B");
        adq.push("C");
        adq.push("D");
        adq.addFirst("E");
        System.out.println("Размер очереди: " + adq.size());
        System.out.println("Coдepжимoe очереди: " + adq);
    }
}
