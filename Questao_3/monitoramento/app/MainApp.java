package monitoramento.app;

import monitoramento.observer.*;
import monitoramento.sensor.EnvironmentalSensor;

public class MainApp {
    public static void main(String[] args) {

        EnvironmentalSensor sensor = new EnvironmentalSensor();

        Observer painel = new ControlPanelObserver();
        Observer alertas = new AlertModuleObserver();
        Observer historico = new HistoryLoggerObserver();

        sensor.addObserver(painel);
        sensor.addObserver(alertas);
        sensor.addObserver(historico);

        sensor.setMeasurements(28.5, 60.0, 75.0);
        System.out.println("-------------------------");

        sensor.setMeasurements(30.2, 55.0, 90.0);
    }
}
