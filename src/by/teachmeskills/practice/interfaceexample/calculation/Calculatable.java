package by.teachmeskills.practice.interfaceexample.calculation;

public interface Calculatable {

    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b);
    }

    private int sumAll(int... values) {
        int result = 0;
        for (int n : values) {
            result += n;
        }
        return result;
    }
}
