package by.teachmeskills.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // создать списочный массив
        List<String> al = new ArrayList<>();

        System.out.println("Начальный размер списочного массива: " + al.size());
        System.out.println("Ввод элементов в списочный массив...");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("D");
        al.add("E");
        System.out.println("Размер списочного массива: " + al.size());
        System.out.println("Сoдepжимoe списочного массива: " + al);
        System.out.println("Удаление элементов из списочного массива...");
        al.remove("A");
        al.remove(1);
        System.out.println("Размер списочного массива: " + al.size());
        System.out.println("Coдepжимoe списочного массива: " + al);


        // Создание коллекции целых чисел
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Содержимое коллекции: " + list);
        // Получить обычный массив
        Integer[] nums = new Integer[list.size()];
        // Вызывается метод toArray() и получается массив элементов типа Integer
        nums = list.toArray(nums);
        System.out.println("Размер массива nums: " + nums.length);
        int sum = 0;
        // Суммируем содержимое массива
        for (Integer i : nums) {
            sum += i;
        }
        System.out.println("Сумма содержимого nums: " + sum);
    }
}
