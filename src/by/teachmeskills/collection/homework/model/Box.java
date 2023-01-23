package by.teachmeskills.collection.homework.model;

import java.util.*;
import java.util.stream.Collectors;

/*
 3. Создайте класс «Ящик», являющийся наследником класса «Контейнер»
    и отличающийся от него ограниченным размером. Размер ящика должен задаваться при его создании (в конструкторе).
    Изменять размер ящика после создания нельзя. Если при добавлении шара будет происходить превышение размера ящика,
    добавления происходить не должно. Класс должен содержать метод,
    возвращающий список шаров, отсортированный по размеру.
 */
public class Box extends Container {

    private int size;

    public Box(int size) {
        this.size = size;
        balls = new HashSet<>();
    }

    public void addBalls(Set<Ball> balls) {
        if (checkBallsSize(balls)) {
            this.balls.addAll(balls);
        }
    }


    private boolean checkBallsSize(Set<Ball> balls) {
        if (balls.size() <= this.size) {
            return true;
        } else {
            System.out.println("Balls were not added. Box can contain max 10 balls. There are "
                                       + balls.size() + " balls in current set.");
            return false;
        }
    }

    public List<Ball> getSortedBalls() {
        //new TreeSet
        return this.balls.stream()
                         .sorted()
                         .collect(Collectors.toList());
    }

    public void printBalls() {
        if (this.balls.size() == 0) {
            System.out.println("The box is empty!");
        } else {
            System.out.println(this.balls);
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        if (!super.equals(o)) return false;
        Box box = (Box) o;
        return Objects.equals(balls, box.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
