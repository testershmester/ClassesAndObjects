package by.teachmeskills.practice.interfaceexample.book;

public class BookDemo {

    public static void main(String[] args) {
        Printable book = new Book("Book Name", "Author", 1995);
        book.print();

        Printable journal = new Journal("Journal");
        journal.print();

        Printable.read();
    }
}
