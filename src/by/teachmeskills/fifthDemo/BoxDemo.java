package by.teachmeskills.fifthDemo;


public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //инициализировать каждый экземпляр класса Box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        double volume1 = mybox1.volume();
        System.out.println("Объем (mybox1) = " + volume1);

        double volume2 = mybox2.volume();
        System.out.println("Объем (mybox2) = " + volume2);
    }
}
