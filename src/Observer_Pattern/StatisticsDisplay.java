package Observer_Pattern;

import Observer_Pattern.Interface.DisplayElement;
import Observer_Pattern.Interface.Observer;
import Observer_Pattern.Interface.Subject;

class StatisticsDisplay implements Observer, DisplayElement {
    private float tempSum = 0.0f;
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private int numReading;

    private Subject weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReading++;

        if(temperature > maxTemp){
            maxTemp = temperature;
        }

        if(temperature < minTemp){
            minTemp = temperature;
        }

        //we will call display inside update as we want to always display thhe updated data on the display.
        //so when the data hets modified after updation it will call display method and that can be displayed after modification
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature  :  " + (tempSum/numReading) + "/" + maxTemp + "/" + minTemp);
    }
}