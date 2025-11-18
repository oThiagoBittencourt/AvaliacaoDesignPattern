package empresa.relatorios.factory;

import empresa.relatorios.report.Report;

public abstract class ReportFactory {

    // Factory Method
    protected abstract Report createReport();

    public void buildReport() {
        Report report = createReport();
        report.prepare();
        report.generate();
    }
}
