package by.teachmeskills.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // создать связный список
        LinkedList<String> ll = new LinkedList<>();
        // ввести элементы в связный список
        System.out.println("Начальный размер связного списка: " + ll.size());
        System.out.println("Ввод элементов в связный список...");
        ll.add("C");
        ll.add("A");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.addLast("Z");
        ll.addFirst("0");
        System.out.println("Размер связного списка: " + ll.size());
        System.out.println("Coдepжимoe связного списка: " + ll);
        System.out.println("Удаление элементов из связного списка...");
        ll.remove("A");
        ll.remove(2);
        System.out.println("Размер связного списка: " + ll.size());
        System.out.println("Coдepжимoe связного списка: " + ll);
        System.out.println("Удаление первого элемента: " + ll.removeFirst());
        System.out.println("Удаление последнего элемента: " + ll.removeLast());
        System.out.println("Размер связного списка: " + ll.size());
        System.out.println("Coдepжимoe связного списка: " + ll);
        // получить и присвоить значение
        String val = ll.get(0);
        ll.set(2, val);
        System.out.println("Coдepжимoe связного списка: " + ll);
    }
}
