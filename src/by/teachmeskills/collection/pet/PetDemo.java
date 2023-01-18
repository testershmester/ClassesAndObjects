package by.teachmeskills.collection.pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Создайте класс Pet и его наследников Cat, Dog, Parrot.
    Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
    а в качестве значения класс Pet.
    Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
 */
public class PetDemo {
    public static void main(String[] args) {
        final int petsCount = 3;
        HashMap<String, Pet> pets = new HashMap<>();
        for (int i = 0; i < petsCount; i++) {
            Cat cat = new Cat("Barsik " + (i + 1));
            pets.put(cat.getName(), cat);
        }
        for (int i = 0; i < petsCount; i++) {
            Dog dog = new Dog("Bim " + (i + 1));
            pets.put(dog.getName(), dog);
        }
        printAllMapKeys(pets);
    }

    public static void printAllMapKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        keys.forEach(System.out::println);
    }
}
