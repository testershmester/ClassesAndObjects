package by.teachmeskills.practice.temperature;

public class KelvinConverter implements Converter {

    public static final double KELVIN_COEFFICIENT = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius + KELVIN_COEFFICIENT;
    }
}
