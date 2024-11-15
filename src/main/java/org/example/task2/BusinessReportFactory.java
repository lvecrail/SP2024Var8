package org.example.task2;

class BusinessReportFactory {
    public static Report createReport(String businessType, String reportType) {
        return new BusinessReport(businessType, reportType);
    }
}
