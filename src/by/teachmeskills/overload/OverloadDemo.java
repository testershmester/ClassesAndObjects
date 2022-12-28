package by.teachmeskills.overload;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload od = new Overload();
        double result;

        // вызвать все варианты метода test()
        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.45);
        System.out.println("Результат вызова ob.test(123.45): " + result);

    }
}
