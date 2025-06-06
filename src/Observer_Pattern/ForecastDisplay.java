package Observer_Pattern;

import Observer_Pattern.Interface.DisplayElement;
import Observer_Pattern.Interface.Subject;
import Observer_Pattern.Interface.Observer;

class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast : ");

        if(currentPressure > lastPressure){
            System.out.println("Improving weather on the way");
        } else if(currentPressure == lastPressure){
            System.out.println("More of the same");
        } else if(currentPressure < lastPressure){
            System.out.println("Watch out, rainy weather");
        }


    }
}