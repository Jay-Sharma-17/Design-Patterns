package Observer_Pattern;

import Observer_Pattern.Interface.Observer;
import Observer_Pattern.Interface.Subject;

import java.util.ArrayList;

class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i =0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humi, float press){
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = press;
        measurementsChanged();
    }

    //other methods.. can be iimplemented herer
}
