package empresa.relatorios.report;

public class WeeklyReport implements Report {

    @Override
    public void prepare() {
        System.out.println("Preparando dados semanais... (fontes: histórico de 7 dias, KPIs)");
    }

    @Override
    public void generate() {
        System.out.println("Gerando Relatório Semanal em formato detalhado.");
    }
}
