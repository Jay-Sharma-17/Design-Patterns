package Observer_Pattern;

import Observer_Pattern.Interface.DisplayElement;
import Observer_Pattern.Interface.Observer;
import Observer_Pattern.Interface.Subject;

class HeatIndexDisplay implements Observer, DisplayElement {
    float headIndex = 0;
    private Subject weatherData;

    public HeatIndexDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        headIndex = calculateHeatIndex(temperature, humidity);
        display();
    }

    private float calculateHeatIndex(float t, float rh){
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    @Override
    public void display() {
        System.out.println("Heat index is  " + headIndex);
    }
}