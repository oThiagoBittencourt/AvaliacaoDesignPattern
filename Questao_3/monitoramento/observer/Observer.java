package monitoramento.observer;

public interface Observer {
    void update(double temperatura, double umidade, double poluicao);
}
