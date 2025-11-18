package monitoramento.observer;

public class HistoryLoggerObserver implements Observer {

    @Override
    public void update(double temperatura, double umidade, double poluicao) {
        System.out.println("Registrando histórico -> T:" + temperatura +
                           " U:" + umidade + " P:" + poluicao);
    }
}
