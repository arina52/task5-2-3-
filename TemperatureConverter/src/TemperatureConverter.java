public class TemperatureConverter {
    public double toCelsius(double temp) {
        return (temp - 32) * (5.0 / 9.0);
    }
    public double toFahrenheit(double temp) {
        return  (9.0 / 5.0) * temp + 32;
    }
}
