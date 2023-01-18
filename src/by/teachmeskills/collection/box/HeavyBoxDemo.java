package by.teachmeskills.collection.box;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
    Создать коллекцию, содержащую объекты HeavyBox.
    Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
    Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */
public class HeavyBoxDemo {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            HeavyBox heavyBox = new HeavyBox(random.nextInt(1000));
            boxes.add(heavyBox);
        }
        System.out.println("Исходная коллекция:");
        boxes.forEach(System.out::println);

        List<HeavyBox> boxesMoreThan300G = getBoxesMoreThan300G(boxes);
        System.out.println("Новая коллекция:\n" + boxesMoreThan300G);
    }

    public static List<HeavyBox> getBoxesMoreThan300G(List<HeavyBox> heavyBoxes) {
/*        List<HeavyBox> boxesMoreThan300G = new ArrayList<>();
        for (HeavyBox box : heavyBoxes) {
            if (box.getWeight() > 300) {
                boxesMoreThan300G.add(box);
                System.out.println("Помещаем коробку весом " + box.getWeight() + " в новую коллекцию");
            }
        }*/
        return heavyBoxes.stream()
                         .filter(b -> b.getWeight() > 300)
                         .collect(Collectors.toList());
    }
}
