package monitoramento.observer;

public class ControlPanelObserver implements Observer {

    @Override
    public void update(double temperatura, double umidade, double poluicao) {
        System.out.println("Painel atualizado -> Temp: " + temperatura +
                           " | Umidade: " + umidade +
                           " | Poluição: " + poluicao);
    }
}
