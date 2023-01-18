package by.teachmeskills.collection.map;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.ROOT);
        // создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(collator);

        // ввести элементы в хеш-отображение
        tm.put("Джoн Доу", 3434.34);
        tm.put("Toм Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Paльф Смит", -19.08);
        // получить множество записей из метода entrySet()
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        // вывести множество записей
        // Ключи и значения выводятся в результате вызова методов getKey() и getValue()
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();
    }
}
