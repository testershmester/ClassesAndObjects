package by.teachmeskills.sixthDemo;

public class BoxDemo {
    public static void main(String[] args) {
        // объявление, распределение и инициализация объектов Box
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;
        // получение объема первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Volume equal " + vol);
        // получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Volume equal " + vol);
    }
}
