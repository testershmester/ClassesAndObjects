package by.teachmeskills.seventhDemo;

public class BoxDemo {
    public static void main(String[] args) {
        // создадим параллелепипеды используя разные конструкторы
        Box mybox6 = new Box(10, 20, 15);
        Box mybox7 = new Box();
        Box mycube = new Box(7);

        Box.variable = 10;
        Box.staticMethodExample();

        System.out.println("Объем (mybox6): " + mybox6.volume());
        System.out.println("Объем (mybox7): " + mybox7.volume());
        System.out.println("Объем (mycube): " + mycube.volume());
    }
}
