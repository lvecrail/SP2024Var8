package org.example.task11;

public class Main {
    public static void main(String[] args) {
        // Создаем текстовый отчет
        TextReport textReport1 = new TextReport("Annual Financial Report", "This is the content of the financial report.");

        // Создаем графический отчет
        GraphicReport graphicReport1 = new GraphicReport("Sales Data", "Image data for sales chart.");

        // Менеджер отчетов для текстового отчета
        ReportManager textReportManager = new ReportManager(textReport1);
        Report clonedTextReport = textReportManager.getClonedReport();

        // Менеджер отчетов для графического отчета
        ReportManager graphicReportManager = new ReportManager(graphicReport1);
        Report clonedGraphicReport = graphicReportManager.getClonedReport();

        // Отображаем оригинальные и клонированные отчеты
        System.out.println("Original Text Report:");
        textReport1.displayReport();
        System.out.println("Cloned Text Report:");
        clonedTextReport.displayReport();

        System.out.println("\nOriginal Graphic Report:");
        graphicReport1.displayReport();
        System.out.println("Cloned Graphic Report:");
        clonedGraphicReport.displayReport();
    }
}
