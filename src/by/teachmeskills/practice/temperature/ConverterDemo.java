package by.teachmeskills.practice.temperature;

public class ConverterDemo {

    public static void main(String[] args) {
        Converter kelvinConverter = new KelvinConverter();
        double kelvin = kelvinConverter.convert(15.5);

        Converter fahrenheitConverter = new FahrenheitConverter();
        double fahrenheit = fahrenheitConverter.convert(15.5);

        System.out.println("Kelvin: " + kelvin +  "\nFahrenheit: " + fahrenheit);
    }
}
