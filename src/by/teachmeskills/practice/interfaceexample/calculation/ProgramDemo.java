package by.teachmeskills.practice.interfaceexample.calculation;

public class ProgramDemo {

    public static void main(String[] args) {
        Calculatable c = new Calculation();

        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
    }
}
