package by.teachmeskills.thirdDemo;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // присваиваем значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присваиваем другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        double volume1 = mybox1.volume();
        System.out.println("Объем (mybox1) = " + volume1);

        double volume2 = mybox2.volume();
        System.out.println("Объем (mybox2) = " + volume2);
    }
}
