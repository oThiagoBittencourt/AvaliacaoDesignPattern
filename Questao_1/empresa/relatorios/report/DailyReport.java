package empresa.relatorios.report;

public class DailyReport implements Report {

    @Override
    public void prepare() {
        System.out.println("Preparando dados diários... (fontes: entregas do dia, métricas rápidas)");
    }

    @Override
    public void generate() {
        System.out.println("Gerando Relatório Diário em formato simples.");
    }
}
