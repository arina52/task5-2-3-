public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("35 celsius to fahrenheit "+converter.toFahrenheit(35));
        System.out.println("100 fahrenheit to celsius "+converter.toCelsius(100));
    }
}