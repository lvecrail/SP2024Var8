package org.example.task11;

class ReportManager {
    private Report report;

    public ReportManager(Report report) {
        this.report = report;
    }

    // Метод для получения клонированного отчета
    public Report getClonedReport() {
        return this.report.cloneReport();
    }
}
