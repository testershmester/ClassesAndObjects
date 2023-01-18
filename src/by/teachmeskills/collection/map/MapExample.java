package by.teachmeskills.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // создать хеш-отображение
        Map<String, Double> hm = new HashMap<>();
        // ввести элементы в хеш-отображение
        hm.put("Джoн Доу", 3434.34);
        hm.put("Toм Смит", 123.22);
        hm.put("Джейн Бейкер", 1378.00);
        hm.put("Тод Холл", 99.22);
        hm.put("Paльф Смит", -19.08);

        // получить множество записей из метода entrySet()
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        // вывести множество записей
        // Ключи и значения выводятся в результате вызова методов getKey() и getValue()
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();
        // внести сумму 1000 на счет "Джона Доу"
        double balance = hm.get("Джoн Доу");
        hm.put("Джoн Доу", balance + 1000.00);
        System.out.println("Hoвый остаток на счете Джона Доу: " + hm.get("Джoн Доу"));
        System.out.println();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
