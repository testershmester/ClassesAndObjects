package by.teachmeskills.practice.interfaceexample.book;

public interface Printable {

    default void print() {
        System.out.println("Undefined printable");
    }

    static void read() {
        System.out.println("Read printable");
    }
}
