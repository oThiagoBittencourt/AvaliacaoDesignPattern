package monitoramento.observer;

public class AlertModuleObserver implements Observer {

    @Override
    public void update(double temperatura, double umidade, double poluicao) {
        if (poluicao > 80) {
            System.out.println("ALERTA! Índice de poluição crítico!");
        }
    }
}
