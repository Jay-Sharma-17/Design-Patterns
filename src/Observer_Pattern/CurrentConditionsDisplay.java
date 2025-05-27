package Observer_Pattern;

import Observer_Pattern.Interface.DisplayElement;
import Observer_Pattern.Interface.Observer;
import Observer_Pattern.Interface.Subject;

class CurrentConditionsDisplay implements Observer, DisplayElement {
    public float temperature;
    public float humidity;
    public float pressure;
    private Subject weatherData; // ye hai subject ka object
    //SUbject ka object isliye chahiye taaki iss class ke constructor mein dal sake and we can use it as observer to register it

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        // pehle iss weatheeData mein pre defined weatherData k equal kro and then register the observer.
        weatherData.registerObserver(this);

        // we used this as we wanted(currentConditions) to be added here as and Observer for the SUbject WeatherData
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    @Override
    public void display() {
        System.out.println("Current Conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
