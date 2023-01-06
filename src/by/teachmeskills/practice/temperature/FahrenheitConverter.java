package by.teachmeskills.practice.temperature;

public class FahrenheitConverter implements Converter {

    public static final int FAHRENHEIT_SUM_COEFFICIENT = 32;
    public static final double FAHRENHEIT_MULTIPLICATION_COEFFICIENT = 1.8;

    @Override
    public double convert(double celsius) {
        return FAHRENHEIT_MULTIPLICATION_COEFFICIENT * celsius + FAHRENHEIT_SUM_COEFFICIENT;
    }
}
