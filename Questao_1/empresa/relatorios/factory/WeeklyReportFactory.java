package empresa.relatorios.factory;

import empresa.relatorios.report.WeeklyReport;
import empresa.relatorios.report.Report;

public class WeeklyReportFactory extends ReportFactory {

    @Override
    protected Report createReport() {
        return new WeeklyReport();
    }
}
