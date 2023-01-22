package by.teachmeskills.collection.homework.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 2. Создайте класс «Контейнер». В контейнер должны помещаться шары.
    В контейнере не должно быть одинаковых шаров (т.е. необходимо осуществлять проверку при добавлении шара
    на наличие его в контейнере).
    Контейнер должен включать следующие методы:
        a. Добавление шара
        b. Удаление шара
        c. Подсчет количества шаров в контейнере
        d. Подсчет суммарного размера шаров в контейнере
        e. Очистка контейнера
        f. Поиск шара в контейнере (проверка наличия)
        g. Вывод размеров всех шаров в контейнере
 */
public class Container {

    private Set<Ball> balls;

    public Container() {
        this.balls = new HashSet<>();
    }

    public void removeBall(Ball ball) {
        boolean isRemoved = balls.remove(ball);
        if (isRemoved) {
            System.out.println(ball + " was removed from set");
        } else {
            System.out.println("Set does not contain " + ball);
        }
    }

    public void addBall(Ball ball) {
        if (balls.contains(ball)) {
            System.out.println(ball + " is already defined in set. Please add unique ball");
        } else {
            balls.add(ball);
        }
    }

    public void addBalls(Set<Ball> balls) {
        this.balls.addAll(balls);
    }

    public void getBallsAmount() {
        System.out.println("Amount of balls = " + this.balls.size());
    }

    public void cleanUpContainer() {
        this.balls.clear();
    }

    public void getBallIfExist(Ball ball) {
        boolean matches = this.balls.stream()
                                    .anyMatch(b -> balls.contains(ball));
        if (matches) {
            System.out.println(ball.toString());
        } else {
            System.out.println(ball.toString() + " does not exist in " + balls);
        }
    }

    public void getSizeOfEachBall() {
        System.out.println("Balls sizes:");
        this.balls.forEach(b -> System.out.println(b.getSize()));
    }

    public void getSummaryBallsSize() {
        int sum = this.balls.stream()
                            .mapToInt(Ball::getSize)
                            .sum();
        System.out.println("Sum of all balls sizes is: " + sum);
    }

    public void printBalls() {
        if (this.balls.size() == 0) {
            System.out.println("The container is empty!");
        } else {
            System.out.println(this.balls);
        }
    }

    @Override
    public String toString() {
        return "Container{" +
                "balls=" + balls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return Objects.equals(balls, container.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }
}
