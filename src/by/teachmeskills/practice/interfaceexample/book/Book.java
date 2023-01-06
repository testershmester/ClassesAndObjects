package by.teachmeskills.practice.interfaceexample.book;

public class Book implements Printable {

    String name;
    String author;
    int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга %s (автор %s) была издана в %s году", name, author, year);
    }
}
