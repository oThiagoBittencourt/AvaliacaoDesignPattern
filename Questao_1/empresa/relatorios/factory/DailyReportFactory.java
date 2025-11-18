package empresa.relatorios.factory;

import empresa.relatorios.report.DailyReport;
import empresa.relatorios.report.Report;

public class DailyReportFactory extends ReportFactory {

    @Override
    protected Report createReport() {
        return new DailyReport();
    }
}
