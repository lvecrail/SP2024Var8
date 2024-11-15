package org.example.task2;

class BusinessReport implements Report {
    private String businessType;
    private String reportType;

    public BusinessReport(String businessType, String reportType) {
        this.businessType = businessType;
        this.reportType = reportType;
    }

    @Override
    public void generate() {
        System.out.println("Генерация " + reportType + " отчета для " + businessType + ".");
    }
}
