package by.teachmeskills.sixthDemo;

public class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box.
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // вычисление и возврат объема
    double volume() {
        return width * height * depth;
    }
}
