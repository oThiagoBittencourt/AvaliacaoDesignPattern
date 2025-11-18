package empresa.relatorios.app;

import empresa.relatorios.factory.DailyReportFactory;
import empresa.relatorios.factory.ReportFactory;
import empresa.relatorios.factory.WeeklyReportFactory;

public class MainApp {
    public static void main(String[] args) {

        ReportFactory dailyFactory = new DailyReportFactory();
        dailyFactory.buildReport();

        System.out.println("----------------");

        ReportFactory weeklyFactory = new WeeklyReportFactory();
        weeklyFactory.buildReport();
    }
}
