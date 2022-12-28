package by.teachmeskills.seventhDemo;

public class Box {
    double width;
    double height;
    double depth;

    static int variable = 5;

    // конструктор, используемый, когда указываются все размеры.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из размеров не указан
    // значение -1 используется для обозначения неинициализированного параллелепипеда
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // метод расчета и вывода объема
    double volume() {
        return width * height * depth;
    }

    static void staticMethodExample() {
        variable = 15;
    }
}
