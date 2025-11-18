package monitoramento.sensor;

import monitoramento.observer.Observer;
import monitoramento.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class EnvironmentalSensor implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private double temperatura;
    private double umidade;
    private double poluicao;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperatura, umidade, poluicao);
        }
    }

    public void setMeasurements(double temperatura, double umidade, double poluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.poluicao = poluicao;
        notifyObservers();
    }
}
