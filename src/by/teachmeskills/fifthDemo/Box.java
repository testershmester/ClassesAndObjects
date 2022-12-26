package by.teachmeskills.fifthDemo;

public class Box {

    double width;
    double height;
    double depth;

    // метод рассчитает и вернет объем
    double volume() {
        return width * height * depth;
    }

    // метод установит размеры коробки
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
