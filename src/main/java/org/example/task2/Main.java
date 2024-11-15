package org.example.task2;

public class Main {
    public static void main(String[] args) {
        // Создание ежедневного финансового отчета
        Report financeDailyReport = BusinessReportFactory.createReport("Финансы", "ежедневный");
        financeDailyReport.generate(); // Вывод: Генерация ежедневного отчета для Финансы.

        // Создание ежемесячного маркетингового отчета
        Report marketingMonthlyReport = BusinessReportFactory.createReport("Маркетинг", "ежемесячный");
        marketingMonthlyReport.generate(); // Вывод: Генерация ежемесячного отчета для Маркетинг.

        // Создание ежегодного производственного отчета
        Report productionAnnualReport = BusinessReportFactory.createReport("Производство", "ежегодный");
        productionAnnualReport.generate(); // Вывод: Генерация ежегодного отчета для Производство.
    }
}
